package com.bichu.service.impl;

import com.bichu.common.ServerResponse;
import com.bichu.dao.TeacherCustomMapper;
import com.bichu.dao.TeacherMapper;
import com.bichu.pojo.Teacher;
import com.bichu.pojo.TeacherCustom;
import com.bichu.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kaven on 2018/10/21.
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public ServerResponse<PageInfo> getTeacherDetails(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teacherList = null;
        teacherList = teacherMapper.selectAllTeachers();
        PageInfo pageInfo = new PageInfo(teacherList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    public ServerResponse<Teacher> getTeacherMoreDetails(Integer id) {
        Teacher teacher = teacherMapper.selectTeacherByPrimaryId(id);
        return ServerResponse.createBySuccess(teacher);
    }
}
