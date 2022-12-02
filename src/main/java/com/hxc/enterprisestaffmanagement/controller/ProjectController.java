package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Project;
import com.hxc.enterprisestaffmanagement.service.DepartmentSevice;
import com.hxc.enterprisestaffmanagement.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProjectController {
    @Resource
    private ProjectService projectService;
    public static final String SUCCESS = "redirect:queryAllProjects";
    @RequestMapping("queryAllProjects")
    public String queryAllProjects(ModelMap modelMap){
        modelMap.put("projects",this.projectService.queryAllProjects());
        return "project/listProject";
    }
    @RequestMapping("toAddProject")
    public String toAddProject(ModelMap modelMap){
        modelMap.put("departments",this.projectService.queryAllDepartments());
        return "project/addProject";
    }
    @RequestMapping("doAddProject")
    public String doAddProject(Project project,int p_department_id){
        Department department = new Department();
        department.setDe_id(p_department_id);
        project.setDepartment(department);
        this.projectService.addProject(project);
        return SUCCESS;
    }
    @RequestMapping("toUpdateProject")
    public String toUpdateProject(int p_id,ModelMap modelMap){
        modelMap.put("project",this.projectService.queryProjectById(p_id));
        modelMap.put("departments",this.projectService.queryAllDepartments());
        return "project/updateProject";
    }
    @RequestMapping("doUpdateProject")
    public String doUpdateProject(Project project,int p_department_id){
        Department department = new Department();
        department.setDe_id(p_department_id);
        project.setDepartment(department);
        this.projectService.updateProject(project);
        return SUCCESS;
    }
    @RequestMapping("doDeleteProject")
    public String doDeleteProject(int p_id){
        this.projectService.deleteProject(p_id);
        return SUCCESS;
    }
    @RequestMapping("queryProjectByName")
    public String queryProjectByName(String p_name,ModelMap modelMap){
        modelMap.put("projects",this.projectService.queryProjects(p_name));
        return "project/listProject";
    }
}
