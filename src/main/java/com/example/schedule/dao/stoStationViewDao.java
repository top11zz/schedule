package com.example.schedule.dao;
import	java.util.Map;

import com.example.schedule.entity.stoStationView;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stoStationViewDao {
    stoStationView selectByPrimaryKey(Integer stoIndex);

    public int  insStationView(stoStationView stostation);
}