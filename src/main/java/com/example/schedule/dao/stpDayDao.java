package com.example.schedule.dao;

import com.example.schedule.entity.stpDay;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface stpDayDao {
    stpDay selectByPrimaryKey(Integer stpId);

    public int insStpDay(stpDay stpDay);
}