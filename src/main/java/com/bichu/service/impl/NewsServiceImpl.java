package com.bichu.service.impl;

import com.bichu.common.ServerResponse;
import com.bichu.dao.NewsMapper;
import com.bichu.pojo.News;
import com.bichu.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public ServerResponse<PageInfo> getNews(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<News> newsList = newsMapper.getNews();
        PageInfo pageInfo = new PageInfo(newsList);
        return ServerResponse.createBySuccess(pageInfo);
    }
}
