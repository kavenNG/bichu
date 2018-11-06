package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.Course;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface CourseService {
    ServerResponse<List<Course>> getCourses();

    ServerResponse<Course> getCourseDetail(Integer id);
}
