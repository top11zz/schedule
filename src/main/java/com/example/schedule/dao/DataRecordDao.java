package com.example.schedule.dao;

import com.example.schedule.entity.DataRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DataRecordDao {
    DataRecord selectByPrimaryKey(Integer stoIndex);

    public int addData(DataRecord dataRecord);

    public DataRecord checkTime(Map<String, Object> map);

    public List<DataRecord> findElecNow(String time);

    public  DataRecord findElecHour(Map<String,Object> map);

    public List<DataRecord> findStationViewNow(String time);

    public Float findStationViewHour(Map<String,Object> map);
}
