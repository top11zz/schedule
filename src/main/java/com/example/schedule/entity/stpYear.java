package com.example.schedule.entity;

import java.util.Date;

public class stpYear {
    private Integer stpId;

    private Integer stpStationId;

    private Integer stpLineId;

    private Float stpElecValue;

    private Date stpElecTime;

    private Integer stpSyncDc;

    private Date stpSyncTime;

    public Integer getStpId() {
        return stpId;
    }

    public void setStpId(Integer stpId) {
        this.stpId = stpId;
    }

    public Integer getStpStationId() {
        return stpStationId;
    }

    public void setStpStationId(Integer stpStationId) {
        this.stpStationId = stpStationId;
    }

    public Integer getStpLineId() {
        return stpLineId;
    }

    public void setStpLineId(Integer stpLineId) {
        this.stpLineId = stpLineId;
    }

    public Float getStpElecValue() {
        return stpElecValue;
    }

    public void setStpElecValue(Float stpElecValue) {
        this.stpElecValue = stpElecValue;
    }

    public Date getStpElecTime() {
        return stpElecTime;
    }

    public void setStpElecTime(Date stpElecTime) {
        this.stpElecTime = stpElecTime;
    }

    public Integer getStpSyncDc() {
        return stpSyncDc;
    }

    public void setStpSyncDc(Integer stpSyncDc) {
        this.stpSyncDc = stpSyncDc;
    }

    public Date getStpSyncTime() {
        return stpSyncTime;
    }

    public void setStpSyncTime(Date stpSyncTime) {
        this.stpSyncTime = stpSyncTime;
    }
}