package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Schedule;
import com.hxc.enterprisestaffmanagement.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ScheduleController {
    @Resource
    private ScheduleService scheduleService;
    public static final String SUCCESS="redirect:queryAllSchedules";
    @RequestMapping("queryAllSchedules")
    public String queryAllSchedules(ModelMap modelMap){
        modelMap.put("schedules",this.scheduleService.queryAllSchedules());
        return "schedule/listSchedule";
    }
    @RequestMapping("toAddSchedule")
    public String toAddSchedule(ModelMap modelMap){
        modelMap.put("departments",this.scheduleService.queryAllDepartments());
        return "schedule/addSchedule";
    }
    @RequestMapping("doAddSchedule")
    public String doAddSchedule(Schedule schedule,int s_department_id){
        Department department = new Department();
        department.setDe_id(s_department_id);
        schedule.setDepartment(department);
        this.scheduleService.addSchedule(schedule);
        return SUCCESS;
    }
    @RequestMapping("toUpdateSchedule")
    public String toUpdateSchedule(ModelMap modelMap,int s_id){
        modelMap.put("schedule",this.scheduleService.queryScheduleById(s_id));
        modelMap.put("departments",this.scheduleService.queryAllDepartments());
        return "schedule/updateSchedule";
    }
    @RequestMapping("doUpdateSchedule")
    public String doUpdateSchedule(Schedule schedule,int s_department_id){
        Department department = new Department();
        department.setDe_id(s_department_id);
        schedule.setDepartment(department);
        this.scheduleService.updateSchedule(schedule);
        return SUCCESS;
    }
    @RequestMapping("doDeleteSchedule")
    public String doDeleteSchedule(int s_id){
        this.scheduleService.deleteSchedule(s_id);
        return SUCCESS;
    }
    @RequestMapping("queryScheduleByName")
    public String queryScheduleByName(String s_name,ModelMap modelMap){
        modelMap.put("schedules",this.scheduleService.querySchedules(s_name));
        return "schedule/listSchedule";
    }
}
