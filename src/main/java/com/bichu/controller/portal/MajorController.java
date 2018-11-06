package com.bichu.controller.portal;

import com.bichu.common.ServerResponse;
import com.bichu.dao.MajorMapper;
import com.bichu.pojo.Category;
import com.bichu.pojo.College;
import com.bichu.pojo.Major;
import com.bichu.service.MajorService;
import com.google.common.collect.Sets;
import com.sun.xml.internal.ws.api.message.saaj.SaajStaxWriter;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/**
 * Created by kaven on 2018/10/24.
 */
@Controller
@RequestMapping("/major/")
public class MajorController {

    @Autowired
    private MajorService majorService;

    @RequestMapping("getMajors.do")
    @ResponseBody
    public void getMajors(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Major> majorList = majorService.getMajors().getData();
        Set<Category> categorySet = Sets.newHashSet();
        for(Major major : majorList) {
            categorySet.add(major.getCategory());
        }
        request.setAttribute("majorList", majorList);
        request.setAttribute("categorySet", categorySet);
        request.getRequestDispatcher("/WEB-INF/jsp/major.jsp").forward(request, response);
    }

    @RequestMapping("downloadFile.do")
    @ResponseBody
    public void download (@RequestParam(value="filename")String filename, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        request.getRequestDispatcher("/case/downloadFile.do").forward(request,response);
    }

    @RequestMapping("getMajorDetails.do")
    @ResponseBody
    public void getMajorDetails(@RequestParam("majorId")Integer majorId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Major major = majorService.findMajorById(majorId).getData();
        request.setAttribute("major", major);
        request.getRequestDispatcher("/WEB-INF/jsp/majorDetail.jsp").forward(request, response);
    }



}
