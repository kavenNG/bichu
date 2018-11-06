package com.bichu.service.impl;


import com.bichu.common.ServerResponse;
import com.bichu.dao.CaseMapper;
import com.bichu.pojo.Case;
import com.bichu.service.CaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaven on 2018/10/17.
 */
@Service("caseService")
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseMapper caseMapper;

    public ServerResponse<PageInfo> getSuccessCase(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Case> caseList = caseMapper.getSuccessCase();
        PageInfo pageInfo = new PageInfo(caseList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    public ServerResponse<PageInfo> getBannerImg(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<String> bannerList = caseMapper.getBannerImg();
        PageInfo pageInfo = new PageInfo(bannerList);
        return ServerResponse.createBySuccess(pageInfo);
    }
}
