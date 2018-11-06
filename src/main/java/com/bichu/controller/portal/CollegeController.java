package com.bichu.controller.portal;
import com.bichu.common.ServerResponse;
import com.bichu.pojo.College;
import com.bichu.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Controller
@RequestMapping("/college/")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @RequestMapping("getCollegeList.do")
    @ResponseBody
    public void getCollegeList(@RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                              @RequestParam(value = "pageSize", defaultValue = "5")int pageSize,
                              HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<College> collegeList = collegeService.getCollegeList(pageNum, pageSize).getData().getList();
        request.setAttribute("collegeList", collegeList);
        request.getRequestDispatcher("/WEB-INF/jsp/college.jsp").forward(request, response);

    }

    @RequestMapping("downloadFile.do")
    @ResponseBody
    public void download (@RequestParam(value="filename")String filename, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        request.getRequestDispatcher("/case/downloadFile.do").forward(request,response);
    }

    @RequestMapping("getCollegeDetails.do")
    @ResponseBody
    public void getCollegeList(Integer id, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("toCollege..........");
        College college = collegeService.getCollegeById(id).getData();
        request.setAttribute("college", college);
        request.getRequestDispatcher("/WEB-INF/jsp/collegeDetail.jsp").forward(request, response);
    }

    @RequestMapping("getCollegeByOrder.do")
    @ResponseBody
    public List<College> getMajorDetails(@RequestParam(value = "country", defaultValue = "美国")String country,
                                         @RequestParam(value = "order", defaultValue = "underScore")String order,
                                         @RequestParam(value = "majorId", defaultValue = "1")Integer majorId,
                                         HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<College> collegeRankList = collegeService.findCollegeOrderByScore(country, majorId, order).getData();
        return collegeRankList;
    }
}


