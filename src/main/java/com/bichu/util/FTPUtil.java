package com.bichu.util;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

/**
 * Created by kaven on 2018/10/7.
 */
public class FTPUtil {
    private static final Logger logger = LoggerFactory.getLogger(FTPUtil.class);

    private static String ftpIP = PropertiesUtil.getProperty("ftp.server.ip");
    private static String ftpUser = PropertiesUtil.getProperty("ftp.user");
    private static String ftpPass = PropertiesUtil.getProperty("ftp.pass");

    public FTPUtil(String ip, int port, String user, String pwd) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.pwd = pwd;
    }

    public static boolean uploadFile(List<File> fileList) throws IOException {
        FTPUtil ftpUtil = new FTPUtil(ftpIP,21,ftpUser, ftpPass);
        logger.info("开始连接ftp服务器");
        boolean result = ftpUtil.uploadFile("img", fileList);
        logger.info("开始连接ftp服务器，结束上传，上传结果:{}");
        return result;
    }

    private boolean uploadFile(String remotePath, List<File> fileList) throws IOException{
        boolean uploaded = true;
        FileInputStream fis = null;
        if (connectServer(this.getIp(), this.getPort(), this.getUser(), this.getPwd())) {
            try {
                ftpClient.changeWorkingDirectory(remotePath);
                ftpClient.setBufferSize(1024);//设置缓冲区
                ftpClient.setControlEncoding("UTF-8");//设置编码
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);//防止乱码
                ftpClient.enterLocalPassiveMode();//打开被动模式
                for(File fileItem : fileList) {
                    fis = new FileInputStream(fileItem);
                    ftpClient.storeFile(fileItem.getName(), fis);
                    System.out.println(fileItem.getName());
                }
            }catch (IOException e) {
                uploaded = false;
                logger.error("上传文件异常", e);
            }finally {
                fis.close();
                ftpClient.disconnect();
            }
        }
        return uploaded;
    }

    //连接FTP服务器
    private boolean connectServer(String ip, int port, String user, String pwd) {
        boolean isSuccess = false;
        ftpClient = new FTPClient();
        try{
            ftpClient.connect(ip, port);
            isSuccess = ftpClient.login(user, pwd);
        }catch (IOException e) {
            logger.error("连接FTP服务器异常");
        }
        return isSuccess;
    }

    public static boolean downloadFile(String filename, String localPath) throws IOException {
        FTPUtil ftpUtil = new FTPUtil(ftpIP,21,ftpUser, ftpPass);
        logger.info("开始连接ftp服务器");
        String dir = "/" + filename.substring(0, filename.lastIndexOf("/"));
        String _filename = filename.substring(filename.lastIndexOf("/") + 1);

        boolean result = ftpUtil.downloadFile(dir, _filename, localPath);
        logger.info("结束下载，下载结果:{}");
        return result;
    }

    private boolean downloadFile(String remotePath, String filename, String localPath)  throws IOException{
        boolean downloaded = true;
        OutputStream fos = null;
        if (connectServer(this.getIp(), this.getPort(), this.getUser(), this.getPwd())) {
            try {
                ftpClient.changeWorkingDirectory(remotePath);
                ftpClient.setBufferSize(1024);//设置缓冲区
                ftpClient.setControlEncoding("UTF-8");//设置编码
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);//防止乱码
                ftpClient.enterLocalPassiveMode();//打开被动模式
                FTPFile[] fs = ftpClient.listFiles();

                for (FTPFile ff : fs) {
                    if (ff.getName().equals(filename)) {
                        File fileDir = new File(localPath);
                        if(!fileDir.exists()){
                            fileDir.setWritable(true);//赋予可写权限
                            fileDir.mkdirs();
                        }

                        File localFile = new File(localPath, filename);
                       /* File localFile = new File(localPath + "/" + ff.getName());*/
                        fos = new FileOutputStream(localFile);
                        ftpClient.retrieveFile(filename, fos);
                    }
                }
            }catch(IOException e) {
                downloaded = false;
                logger.error("下载文件异常", e);
            }finally {
                if(fos != null) {
                    fos.close();
                }
                ftpClient.disconnect();
            }
        }
        return downloaded;

    }

    private String ip;
    private int port;
    private String user;
    private String pwd;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public FTPClient getFtpClient() {
        return ftpClient;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }

    private FTPClient ftpClient;
}
