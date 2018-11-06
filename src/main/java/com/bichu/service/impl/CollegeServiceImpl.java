package com.bichu.service.impl;

import com.bichu.common.ServerResponse;
import com.bichu.dao.CollegeMapper;
import com.bichu.pojo.College;
import com.bichu.service.CollegeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.AfterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.CollationElementIterator;
import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Service("collegeService")
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeMapper collegeMapper;

    public ServerResponse<PageInfo> getCollegeList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<College> collegeList = collegeMapper.getCollegeList();
        PageInfo pageInfo = new PageInfo(collegeList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    public ServerResponse<College> getCollegeById(Integer id) {
        College college = collegeMapper.getCollegeById(id);
        return ServerResponse.createBySuccess(college);
    }

    public ServerResponse<List<College>> findCollegeOrderByScore(String country,Integer majorId, String order) {
        List<College> collegeRankList = collegeMapper.findCollegeOrderByScore(country, majorId, order);
        if(collegeRankList != null) {
            return ServerResponse.createBySuccess(collegeRankList);
        }
        return ServerResponse.createByErrorMessage("没有数据");
    }
}
