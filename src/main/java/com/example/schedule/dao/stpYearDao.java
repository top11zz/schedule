package com.example.schedule.dao;

import com.example.schedule.entity.stpYear;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stpYearDao {
    stpYear selectByPrimaryKey(Integer stpId);
}