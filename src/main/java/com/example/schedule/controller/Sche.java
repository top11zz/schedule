package com.example.schedule.controller;
import	java.lang.ref.Reference;

import com.example.schedule.dao.DataRecordDao;
import com.example.schedule.dao.stoStationViewDao;
import com.example.schedule.dao.stpDayDao;
import com.example.schedule.entity.DataRecord;
import com.example.schedule.entity.stoStationView;
import com.example.schedule.entity.stpDay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

@Component
@Configuration
@EnableScheduling
public class Sche {
    Logger log = LoggerFactory.getLogger(Sche.class);
    @Resource
    private DataRecordDao dataRecordDao;

    @Resource
    private stpDayDao stpDayDao;

    @Resource
    private stoStationViewDao stoStationViewDao;

    @Async
    @Scheduled(cron="0 2 * * * ?")
    public void configureTasks(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:00:00");
        String now = sdf.format(date);//当前时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,calendar.get(Calendar.HOUR_OF_DAY)-1);
        String last = sdf.format(calendar.getTime());//上一个小时时间
        //calendar.add(Calendar.MONTH, -1);
        List<DataRecord> dataRecordNow = dataRecordDao.findElecNow(now);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("time",last);
        List<DataRecord> elecList = new ArrayList<DataRecord>();
        System.out.println("stpDay时间："+last);
        log.info("stpDay时间："+last);
        for (DataRecord dataRecord: dataRecordNow) {
            map.put("stationId",dataRecord.getStoStationId());
            map.put("lineId",dataRecord.getStoLineId());
            map.put("nowElec",dataRecord.getM10031());
            if(dataRecord.getM10031()!=null){
                DataRecord dr = dataRecordDao.findElecHour(map);
                if(dr!=null){elecList.add(dr);}
            }
        }
        stpDay stpDay = null;
        int i = 0 ;
        for (DataRecord dataRecord: elecList) {
            System.out.println("stpElec:"+dataRecord.getM10031());
            stpDay = new stpDay(dataRecord.getStoStationId(),dataRecord.getStoLineId(),dataRecord.getM10031(),dataRecord.getStoSyncTime(),1,dataRecord.getStoSyncTime());
             i += stpDayDao.insStpDay(stpDay);
        }
        log.info("添加："+ i +"条");
        log.info("stpDay添加完毕");
        System.out.println("stpDay添加："+ i +"条");
        System.out.println("stpDay添加完毕");
    }

    @Async
    @Scheduled(cron="0 2 * * * ?")
    public void configureTasks2(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:00:00");
        String now = sdf.format(date);//当前时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,calendar.get(Calendar.HOUR_OF_DAY)-1);
        String last = sdf.format(calendar.getTime());//上一个小时时间
        //calendar.add(Calendar.MONTH, -1);
        List<DataRecord> dataRecordNow = dataRecordDao.findStationViewNow(now);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("time",last);
        log.info("stationView时间："+last);
        Float f = null;
        List<stoStationView> stationViews =  new ArrayList <stoStationView>();
        for (DataRecord dataRecord: dataRecordNow) {
            map.put("stationId",dataRecord.getStoStationId());
            map.put("nowElec",dataRecord.getM10031());
            if(dataRecord.getM10031()!=null) {
                f = dataRecordDao.findStationViewHour(map);
            }
            stationViews.add(new stoStationView(dataRecord.getStoStationId(),last,f,dataRecord.getM10017(),dataRecord.getM10019(),null,null));
        }
        int i = 0;
        for (stoStationView view:stationViews){
             i +=stoStationViewDao.insStationView(view);
        }
        System.out.println("stoStaionView插入了：" +i+" 条");
        System.out.println("stoStaionView添加完毕");
    }
}
