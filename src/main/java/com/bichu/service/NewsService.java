package com.bichu.service;

import com.bichu.common.ServerResponse;
import com.github.pagehelper.PageInfo;

/**
 * Created by kaven on 2018/10/24.
 */
public interface NewsService {
    ServerResponse<PageInfo> getNews(int pageNum, int pageSize);
}
