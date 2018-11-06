package com.bichu.service.impl;

import com.bichu.common.ServerResponse;
import com.bichu.dao.MajorMapper;
import com.bichu.pojo.College;
import com.bichu.pojo.Major;
import com.bichu.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Service("majorService")
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    public ServerResponse<List<Major>> getMajors() {
        List<Major> majorList = majorMapper.getMajors();
        return ServerResponse.createBySuccess(majorList);
    }

    public ServerResponse<Major> findMajorById(Integer majorId) {
        Major major = majorMapper.findMajorById(majorId);
        return ServerResponse.createBySuccess(major);
    }


}
