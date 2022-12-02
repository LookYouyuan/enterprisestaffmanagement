package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.PositionMapper;
import com.hxc.enterprisestaffmanagement.mapper.ProjectMapper;
import com.hxc.enterprisestaffmanagement.mapper.ScheduleMapper;
import com.hxc.enterprisestaffmanagement.service.DepartmentSevice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentSevice {
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private ScheduleMapper scheduleMapper;

    @Transactional
    @Override
    public int deleteDepartment(int de_id) {
        this.projectMapper.deleteProjectByDe_id(de_id);
        this.positionMapper.deletePositionByDe_id(de_id);
        this.scheduleMapper.deleteScheduleByDe_id(de_id);
        this.departmentMapper.deleteDepartmentByDe_id(de_id);
        return this.departmentMapper.deleteDepartment(de_id);
    }


    @Override
    public int addDepartment(Department department) {
        return this.departmentMapper.addDepartment(department);
    }

    @Override
    public int updateDepartment(Department department) {
        return this.departmentMapper.updateDepartment(department);
    }



    @Override
    public List<Department> queryDepartmentByName(String de_name) {
        return this.departmentMapper.queryDepartmentByName(de_name);
    }


    @Override
    public Department queryDepartmentById(int de_id) {
        return this.departmentMapper.queryDepartmentById(de_id);
    }

    @Override
    public List<Department> queryAllDepartments(){
        return departmentMapper.queryAllDepartments();
    }



}
