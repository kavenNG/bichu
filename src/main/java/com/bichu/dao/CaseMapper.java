package com.bichu.dao;


import com.bichu.pojo.Case;

import java.util.List;

public interface CaseMapper {
    List<Case> getSuccessCase();

    List<String> getBannerImg();
}