package com.hxc.enterprisestaffmanagement.Test;

import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Schedule;
import com.hxc.enterprisestaffmanagement.mapper.ScheduleMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScheduleTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private ScheduleMapper scheduleMapper;
    @Test
    public void testAddSchedule() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String d = "2020-06-13";
        Date s_date = dateFormat.parse(d);
        Department department = new Department();
        department.setDe_id(1100);
        Schedule schedule = new Schedule(0,department,"1999-10-12","大事件");
        this.print(this.scheduleMapper.addSchedule(schedule));
    }
    @Test
    public void testUpdateSchedule() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String d = "2020-06-15";
        Date s_date = dateFormat.parse(d);
        Department department = new Department();
        department.setDe_id(1100);
        int s_id = 4;
        Schedule schedule = new Schedule(s_id,department,"1999-10-12","小事件");
        this.print(this.scheduleMapper.updateSchedule(schedule));
    }
    @Test
    public void testDeleteSchedule(){
        int s_id=4;
        this.print(this.scheduleMapper.deleteSchedule(s_id));
    }
    @Test
    public void testQueryAllSchedules(){
        this.scheduleMapper.queryAllSchedules();
    }
    @Test
    public void testQueryScheduleById(){
        int s_id = 1;
        this.scheduleMapper.queryScheduleById(s_id);
    }
    @Test
    public void testQuerySchedules(){
        String s_name="大";
        this.scheduleMapper.querySchedules(s_name);
    }
}
