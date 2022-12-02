package com.hxc.enterprisestaffmanagement.service;

import com.hxc.enterprisestaffmanagement.entity.Department;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface DepartmentSevice {
    int addDepartment(Department department);
    int updateDepartment(Department department);
    int deleteDepartment(int de_id);
    List<Department> queryDepartmentByName(String de_name);
    Department queryDepartmentById(int de_id);
    List<Department> queryAllDepartments();

}
