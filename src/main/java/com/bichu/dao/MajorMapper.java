package com.bichu.dao;

import com.bichu.pojo.College;
import com.bichu.pojo.Major;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by kaven on 2018/10/24.
 */
public interface MajorMapper {

    List<Major> getMajors();

    Major findMajorById(Integer id);


}
