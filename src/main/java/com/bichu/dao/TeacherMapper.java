package com.bichu.dao;

import com.bichu.pojo.Teacher;

import java.util.List;

/**
 * Created by kaven on 2018/10/21.
 */
public interface TeacherMapper {
    List<Teacher> selectAllTeachers();

    Teacher selectTeacherByPrimaryId(Integer id);
}
