package com.hxc.enterprisestaffmanagement.mapper;

import com.hxc.enterprisestaffmanagement.entity.Schedule;

import java.util.List;

public interface ScheduleMapper {
    int addSchedule(Schedule schedule);
    int updateSchedule(Schedule schedule);
    int deleteSchedule(int s_id);
    Schedule queryScheduleById(int s_id);
    List<Schedule> queryAllSchedules();
    List<Schedule> querySchedules(String name);

    int deleteScheduleByDe_id(int s_department_id );
}
