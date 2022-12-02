package com.hxc.enterprisestaffmanagement.service;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    int addSchedule(Schedule schedule);
    int updateSchedule(Schedule schedule);
    int deleteSchedule(int s_id);
    Schedule queryScheduleById(int s_id);
    List<Schedule> queryAllSchedules();
    List<Schedule> querySchedules(String s_name);
    List<Department> queryAllDepartments();
}
