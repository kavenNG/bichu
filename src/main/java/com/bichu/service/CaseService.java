package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.github.pagehelper.PageInfo;

/**
 * Created by kaven on 2018/10/17.
 */
public interface CaseService {
    ServerResponse<PageInfo> getSuccessCase(int pageNum, int pageSize);

    ServerResponse<PageInfo> getBannerImg(int pageNum, int pageSize);
}
