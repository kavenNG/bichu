package com.bichu.dao;

import com.bichu.pojo.Course;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface CourseMapper {

    List<Course> getCourses();

    Course getCourseById(Integer id);
}
