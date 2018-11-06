package com.bichu.service.impl;

import com.bichu.service.FileService;
import com.google.common.collect.Lists;
import com.bichu.service.FileService;
import com.bichu.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by kaven on 2018/10/7.
 */
@Service("fileService")
public class FileServiceImpl implements FileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file, String path) {
        String fileName = file.getOriginalFilename();
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        String uploadFileName = UUID.randomUUID().toString() + "." + fileExtensionName;
        logger.info("开始上传文件，上传的文件名:{},上传的路径:{},新文件名:{}",fileName,path,uploadFileName);

        File fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);//赋予可写权限
            fileDir.mkdirs();
        }
        File targetFile = new File(path, uploadFileName);//Problem
        try{
            file.transferTo(targetFile);
            //将targetFile上传倒FTP服务器上
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
            //上传完之后，删除upload下的文件
            targetFile.delete();
        }catch (IOException e) {
            logger.error("上传文件异常", e);
            return null;
        }
        return targetFile.getName();
    }

    public String download(String filename, String localPath) {
        if(filename.endsWith("/")) {
            filename = filename.substring(0, filename.lastIndexOf("/"));
        }
        String filenameNew = filename.substring(filename.lastIndexOf("/") + 1);
        logger.info("开始下载文件，下载的文件名:{},下载的路径:{},新文件名:{}",filename,localPath,filenameNew);
        try {
            FTPUtil.downloadFile(filename, localPath);
        }catch (IOException e) {
            logger.error("下载文件异常", e);
            return null;
        }

        return localPath + "/" + filenameNew;
    }


}
