package com.bichu.controller.portal;


import com.bichu.common.ServerResponse;
import com.bichu.pojo.Case;
import com.bichu.service.CaseService;
import com.bichu.service.FileService;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.sun.corba.se.spi.activation.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by kaven on 2018/10/17.
 */
@Controller
@RequestMapping("/case/")
public class CaseController {

    @Autowired
    private CaseService caseService;

    @Autowired
    private FileService fileService;

    @RequestMapping("getSuccess.do")
    @ResponseBody
    public ServerResponse<List<Case>> getSuccessCase (@RequestParam(value="pageNum", defaultValue = "1")int pageNum,
                                                   @RequestParam(value="pageSize", defaultValue = "1")int pageSize,
                                 HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {

        PageInfo pageInfo = caseService.getSuccessCase(pageNum, pageSize).getData();
        List<Case> caseList = pageInfo.getList();
        return ServerResponse.createBySuccess(caseList);
    }

    @RequestMapping("downloadFile.do")
    @ResponseBody
    public void download (@RequestParam(value="filename")String filename, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String path = request.getSession().getServletContext().getRealPath("download");
        String filePath = fileService.download(filename, path);
        File file = new File(filePath); // 括号里参数为文件图片路径
        OutputStream os = null;
        if (file.exists()) { // 如果文件存在
            InputStream in;
            try {
                in = new FileInputStream(file);
                os = response.getOutputStream(); // 创建输出流
                byte[] b = new byte[1024];
                while (in.read(b) != -1) {
                    os.write(b);
                }
                in.close();
                os.flush();
                os.close();
                boolean rs = file.delete();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                os.flush();
                os.close();
            }
        }else {
            System.out.println("下载失败，文件不存在");
        }
    }

    @RequestMapping("getBannerImg.do")
    @ResponseBody
    public ServerResponse<List<String>> getBannerImg(@RequestParam(value="pageNum", defaultValue = "1")int pageNum,
                                                      @RequestParam(value="pageSize", defaultValue = "4")int pageSize,
                                                      HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {

        PageInfo pageInfo = caseService.getBannerImg(pageNum, pageSize).getData();
        List<String> bannerList = pageInfo.getList();
        return ServerResponse.createBySuccess(bannerList);
    }
}
