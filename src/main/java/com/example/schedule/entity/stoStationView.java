package com.example.schedule.entity;

import java.util.Date;

public class stoStationView {
    private Integer stoIndex;

    private Integer stoStationId;

    private String stoSyncTime;

    private Float stoRealelecTotal;

    private Float stoActpowerTotal;

    private Float stoReactpowerTotal;

    private Float stoAmbtempReal;

    private Float stoAmbhumidReal;

    public Integer getStoIndex() {
        return stoIndex;
    }

    public void setStoIndex(Integer stoIndex) {
        this.stoIndex = stoIndex;
    }

    public Integer getStoStationId() {
        return stoStationId;
    }

    public void setStoStationId(Integer stoStationId) {
        this.stoStationId = stoStationId;
    }

    public String getStoSyncTime() {
        return stoSyncTime;
    }

    public void setStoSyncTime(String stoSyncTime) {
        this.stoSyncTime = stoSyncTime;
    }

    public Float getStoRealelecTotal() {
        return stoRealelecTotal;
    }

    public void setStoRealelecTotal(Float stoRealelecTotal) {
        this.stoRealelecTotal = stoRealelecTotal;
    }

    public Float getStoActpowerTotal() {
        return stoActpowerTotal;
    }

    public void setStoActpowerTotal(Float stoActpowerTotal) {
        this.stoActpowerTotal = stoActpowerTotal;
    }

    public Float getStoReactpowerTotal() {
        return stoReactpowerTotal;
    }

    public void setStoReactpowerTotal(Float stoReactpowerTotal) {
        this.stoReactpowerTotal = stoReactpowerTotal;
    }

    public Float getStoAmbtempReal() {
        return stoAmbtempReal;
    }

    public void setStoAmbtempReal(Float stoAmbtempReal) {
        this.stoAmbtempReal = stoAmbtempReal;
    }

    public Float getStoAmbhumidReal() {
        return stoAmbhumidReal;
    }

    public void setStoAmbhumidReal(Float stoAmbhumidReal) {
        this.stoAmbhumidReal = stoAmbhumidReal;
    }

    public stoStationView() {
    }

    public stoStationView(Integer stoStationId, String stoSyncTime, Float stoRealelecTotal, Float stoActpowerTotal, Float stoReactpowerTotal, Float stoAmbtempReal, Float stoAmbhumidReal) {
        this.stoStationId = stoStationId;
        this.stoSyncTime = stoSyncTime;
        this.stoRealelecTotal = stoRealelecTotal;
        this.stoActpowerTotal = stoActpowerTotal;
        this.stoReactpowerTotal = stoReactpowerTotal;
        this.stoAmbtempReal = stoAmbtempReal;
        this.stoAmbhumidReal = stoAmbhumidReal;
    }

    public stoStationView(Integer stoIndex, Integer stoStationId, String stoSyncTime, Float stoRealelecTotal, Float stoActpowerTotal, Float stoReactpowerTotal, Float stoAmbtempReal, Float stoAmbhumidReal) {
        this.stoIndex = stoIndex;
        this.stoStationId = stoStationId;
        this.stoSyncTime = stoSyncTime;
        this.stoRealelecTotal = stoRealelecTotal;
        this.stoActpowerTotal = stoActpowerTotal;
        this.stoReactpowerTotal = stoReactpowerTotal;
        this.stoAmbtempReal = stoAmbtempReal;
        this.stoAmbhumidReal = stoAmbhumidReal;
    }
}