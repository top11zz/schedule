package com.example.schedule.entity;

import java.util.Date;

public class stpDay {
    private Integer stpId;

    private Integer stpStationId;

    private Integer stpLineId;

    private Float stpElecValue;

    private String stpElecTime;

    private Integer stpSyncDc;

    private String stpSyncTime;


    public stpDay() {
    }

    public stpDay(Integer stpId, Integer stpStationId, Integer stpLineId, Float stpElecValue, String stpElecTime, Integer stpSyncDc, String stpSyncTime) {
        this.stpId = stpId;
        this.stpStationId = stpStationId;
        this.stpLineId = stpLineId;
        this.stpElecValue = stpElecValue;
        this.stpElecTime = stpElecTime;
        this.stpSyncDc = stpSyncDc;
        this.stpSyncTime = stpSyncTime;
    }

    public stpDay(Integer stpStationId, Integer stpLineId, Float stpElecValue, String stpElecTime, Integer stpSyncDc, String stpSyncTime) {
        this.stpStationId = stpStationId;
        this.stpLineId = stpLineId;
        this.stpElecValue = stpElecValue;
        this.stpElecTime = stpElecTime;
        this.stpSyncDc = stpSyncDc;
        this.stpSyncTime = stpSyncTime;
    }

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

    public String getStpElecTime() {
        return stpElecTime;
    }

    public void setStpElecTime(String stpElecTime) {
        this.stpElecTime = stpElecTime;
    }

    public Integer getStpSyncDc() {
        return stpSyncDc;
    }

    public void setStpSyncDc(Integer stpSyncDc) {
        this.stpSyncDc = stpSyncDc;
    }

    public String getStpSyncTime() {
        return stpSyncTime;
    }

    public void setStpSyncTime(String stpSyncTime) {
        this.stpSyncTime = stpSyncTime;
    }
}