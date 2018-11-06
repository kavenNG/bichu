package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.College;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface CollegeService {
    ServerResponse<PageInfo> getCollegeList(int pageNum, int pageSize);

    ServerResponse<College> getCollegeById(Integer id);

    ServerResponse<List<College>> findCollegeOrderByScore(String country, Integer majorId, String order);
}
