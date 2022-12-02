package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.service.DepartmentSevice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentSevice departmentSevice;
    public static final String SUCCESS = "redirect:queryAllDepartments";
    @RequestMapping("queryAllDepartments")
    public String queryAllDepartments(ModelMap modelMap){
        List<Department> departments = this.departmentSevice.queryAllDepartments();
        modelMap.put("departments",departments);
        return "department/listDepartment";
    }
    @RequestMapping("queryDepartmentByName")
    public String queryDepartmentByName(String de_name,ModelMap modelMap){
        List<Department> departments = this.departmentSevice.queryDepartmentByName(de_name);
        modelMap.put("departments",departments);
        return "department/listDepartment";
    }

    @RequestMapping("queryDepartmentById")
    public String queryDepartmentById(int de_id,ModelMap modelMap){
        modelMap.put("department",this.departmentSevice.queryDepartmentById(de_id));
        return "department/listDepartment";
    }

    @RequestMapping("addAllDepartments")
    public String addAllDepartments(ModelMap modelMap){
        List<Department> departments = this.departmentSevice.queryAllDepartments();
        modelMap.put("departments",departments);
        return "department/addDepartment";
    }
    @RequestMapping("toaddDepartment")
    public String toaddDepartment(){
        return "department/addDepartment";
    }
    @RequestMapping("doAddDepartment")
    public String doAddDepartment(Department department){
        this.departmentSevice.addDepartment(department);
        return SUCCESS;
    }

    @RequestMapping("toUpdateDepartment")
    public String toUpdateDepartment(int de_id, ModelMap modelMap){
        modelMap.put("department",this.departmentSevice.queryDepartmentById(de_id));
        modelMap.put("departments",this.departmentSevice.queryAllDepartments());
        return "department/updateDepartment";
    }
    @RequestMapping("doUpdateDepartment")
    public String doUpdateDepartment(Department department){
        this.departmentSevice.updateDepartment(department);
        return SUCCESS;
    }

    @RequestMapping("doDeleteDepartment")
    public String doDeleteDepartment(int de_id){
        this.departmentSevice.deleteDepartment(de_id);
        return SUCCESS;
    }
}
