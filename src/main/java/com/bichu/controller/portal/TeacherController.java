package com.bichu.controller.portal;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.Case;
import com.bichu.pojo.Teacher;
import com.bichu.pojo.TeacherCustom;
import com.bichu.service.CaseService;
import com.bichu.service.FileService;
import com.bichu.service.TeacherService;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaven on 2018/10/21.
 */
@RequestMapping("/teacher/")
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private FileService fileService;


    @RequestMapping("getTeacherDetails.do")
    @ResponseBody
    public ServerResponse getTeacherDetails(@RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                                            @RequestParam(value = "pageSize", defaultValue = "6")int pageSize) {
        PageInfo pageInfo = (PageInfo) teacherService.getTeacherDetails(pageNum, pageSize).getData();
        List<Teacher> teacherList = pageInfo.getList();
        return ServerResponse.createBySuccess(teacherList);
    }

    @RequestMapping("getTeacherMoreDetails.do")
    @ResponseBody
    public void getTeacherDetails(@RequestParam("id")Integer id, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Teacher teacher = teacherService.getTeacherMoreDetails(id).getData();

        request.setAttribute("teacher", teacher);
        request.getRequestDispatcher("/WEB-INF/jsp/teachers.jsp").forward(request, response);
    }

    @RequestMapping("downloadFile.do")
    @ResponseBody
    public void download (@RequestParam(value="filename")String filename, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        request.getRequestDispatcher("/case/downloadFile.do").forward(request,response);
    }

}
