package com.bichu.service.impl;

import com.bichu.common.ServerResponse;
import com.bichu.dao.CourseMapper;
import com.bichu.pojo.Course;
import com.bichu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseMapper courseMapper;

    public ServerResponse<List<Course>> getCourses() {
        List<Course> courseList = courseMapper.getCourses();
        return ServerResponse.createBySuccess(courseList);
    }

    public ServerResponse<Course> getCourseDetail(Integer id) {
        Course course = courseMapper.getCourseById(id);
        return ServerResponse.createBySuccess(course);
    }
}
