package com.bichu.dao;

import com.bichu.pojo.College;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface CollegeMapper {
    List<College> getCollegeList();

    College getCollegeById(Integer id);

    List<College> findCollegeOrderByScore(@Param("country")String country, @Param("majorId")Integer majorId, @Param("order")String order);

}
