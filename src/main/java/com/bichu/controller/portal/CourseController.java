package com.bichu.controller.portal;

import com.bichu.pojo.Category;
import com.bichu.pojo.Course;
import com.bichu.pojo.Major;
import com.bichu.service.CourseService;
import com.google.common.collect.Sets;
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
import java.util.List;
import java.util.Set;

/**
 * Created by kaven on 2018/10/24.
 */
@Controller
@RequestMapping("/course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("getCourses.do")
    @ResponseBody
    public void getCourses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Course> courseList = courseService.getCourses().getData();
        Set<Category> categorySet = Sets.newHashSet();
        for(Course course: courseList) {
            categorySet.add(course.getCategory());
        }
     /*   for(Category category : categorySet) {
            System.out.println(category);
        }
        System.out.println(Arrays.toString(courseList.toArray()));*/
        request.setAttribute("courseList", courseList);
        request.setAttribute("courseCategorySet", categorySet);
        request.getRequestDispatcher("/WEB-INF/jsp/course.jsp").forward(request, response);
    }

    @RequestMapping("downloadFile.do")
    @ResponseBody
    public void download (@RequestParam(value="filename")String filename, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        request.getRequestDispatcher("/case/downloadFile.do").forward(request,response);
    }

    @RequestMapping("getCourseDetail.do")
    @ResponseBody
    public void download (Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        Course course = courseService.getCourseDetail(id).getData();
        request.setAttribute("course", course);
        request.getRequestDispatcher("/WEB-INF/jsp/courseDetail.jsp").forward(request,response);
    }

}
