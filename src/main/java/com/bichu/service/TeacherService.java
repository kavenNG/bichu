package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.Teacher;
import org.springframework.stereotype.Service;

/**
 * Created by kaven on 2018/10/21.
 */
@Service
public interface TeacherService {
    ServerResponse getTeacherDetails(int pageNum, int pageSize);
    ServerResponse<Teacher> getTeacherMoreDetails(Integer id);
}
