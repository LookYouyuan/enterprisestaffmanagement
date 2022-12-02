package com.hxc.enterprisestaffmanagement.Test;

import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.service.DepartmentSevice;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DepartmentTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private DepartmentSevice departmentSevice;

    @Test
    public void testAddDepartment(){
        Department department = new Department(1508,"高考加油",1500);
        this.print(this.departmentSevice.addDepartment(department));
    }
    @Test
    public void testUpdateDepartment(){
        Department department = new Department(1509,"客户中心",1500);
        this.print(this.departmentSevice.updateDepartment(department));
    }
    @Test
    public void testDeleteDepartment(){
        int de_id = 1538;
        this.print(this.departmentSevice.deleteDepartment(de_id));
    }
    @Test
    public void testQueryDepartmentById(){
        int de_id = 1300;
        this.departmentSevice.queryDepartmentById(de_id);
    }
    @Test
    public  void testQueryDepartmentByName(){
        String de_name = "人事部";
        this.departmentSevice.queryDepartmentByName(de_name);
    }

    @Test
    public void testAllQueryDepartment(){
        this.departmentSevice.queryAllDepartments();
    }

}
