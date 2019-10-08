package com.example.schedule.dao;

import com.example.schedule.entity.stpMonth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stpMonthDao {
    stpMonth selectByPrimaryKey(Integer stpId);
}