package com.hxc.enterprisestaffmanagement.Test;

import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Project;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.ProjectMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private DepartmentMapper departmentMapper;
 /*   @Test*/
/*    public void testAddProject() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String d1 = "2020-07-31";
        Date p_end = dateFormat.parse(d1);
        Department department = new Department();
        department.setDe_id(1200);
        Project project = new Project(0,"发工资", department,null, p_end);
        this.print(this.projectMapper.addProject(project));
    }*/
/*    @Test*/
/*    public void testUpdateProject() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String d1= "2020-07-25";
        String d2= "2020-08-03";
        Date p_begin = dateFormat.parse(d1);
        Date p_end = dateFormat.parse(d2);
        Project project = new Project(10,"交税",p_begin,p_end);
        this.print(this.projectMapper.updateProject(project));
    }*/
    @Test
    public void testDeleteProject(){
        int p_id=8;
        this.print(this.projectMapper.deleteProject(p_id));
    }
    @Test
    public void testQueryAllProjects(){
        this.projectMapper.queryAllProjects();
    }
    @Test
    public void testQueryProjectsById(){
        int p_id=2;
        this.projectMapper.queryProjectById(p_id);
    }
    @Test
    public void testQueryProjects(){
        String p_name = "业";
        this.projectMapper.queryProjects(p_name);
    }
    @Test
    public void testQueryAllDepartments(){
        this.departmentMapper.queryAllDepartments();
    }
}

