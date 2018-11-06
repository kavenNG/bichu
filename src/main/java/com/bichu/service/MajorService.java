package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.Major;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface MajorService {
    ServerResponse<List<Major>> getMajors();

    ServerResponse<Major> findMajorById(Integer id);
}
