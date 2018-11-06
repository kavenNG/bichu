package com.bichu.controller.portal;

import com.bichu.common.ServerResponse;
import com.bichu.pojo.News;
import com.bichu.service.NewsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
@Controller
@RequestMapping("/news/")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("getNews.do")
    @ResponseBody
    public ServerResponse<List<News>> getNews(@RequestParam(value="pageNum", defaultValue = "1")int pageNum,
                                              @RequestParam(value="pageSize", defaultValue = "3")int pageSize,
                                              HttpServletRequest request, HttpServletResponse response) {
        List<News> newsList = newsService.getNews(pageNum, pageSize).getData().getList();
        return ServerResponse.createBySuccess(newsList);
    }
}
