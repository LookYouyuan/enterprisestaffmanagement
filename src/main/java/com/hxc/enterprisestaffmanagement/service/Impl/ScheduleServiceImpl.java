package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Schedule;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.ScheduleMapper;
import com.hxc.enterprisestaffmanagement.service.ScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    private ScheduleMapper scheduleMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public int addSchedule(Schedule schedule) {
        return this.scheduleMapper.addSchedule(schedule);
    }

    @Override
    public int updateSchedule(Schedule schedule) {
        return this.scheduleMapper.updateSchedule(schedule);
    }

    @Override
    public int deleteSchedule(int s_id) {
        return this.scheduleMapper.deleteSchedule(s_id);
    }

    @Override
    public Schedule queryScheduleById(int s_id) {
        return this.scheduleMapper.queryScheduleById(s_id);
    }

    @Override
    public List<Schedule> queryAllSchedules() {
        return this.scheduleMapper.queryAllSchedules();
    }

    @Override
    public List<Schedule> querySchedules(String s_name) {
        return this.scheduleMapper.querySchedules(s_name);
    }

    @Override
    public List<Department> queryAllDepartments() {
        return this.departmentMapper.queryAllDepartments();
    }
}
