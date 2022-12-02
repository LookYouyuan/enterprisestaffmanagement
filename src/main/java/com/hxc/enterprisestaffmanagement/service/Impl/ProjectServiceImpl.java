package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Project;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.ProjectMapper;
import com.hxc.enterprisestaffmanagement.service.ProjectService;
import com.sun.scenario.effect.impl.prism.PrReflectionPeer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public int addProject(Project project) {
        return this.projectMapper.addProject(project);
    }

    @Override
    public int updateProject(Project project) {
        return this.projectMapper.updateProject(project);
    }

    @Override
    public int deleteProject(int p_id) {
        return this.projectMapper.deleteProject(p_id);
    }

    @Override
    public Project queryProjectById(int p_id) {
        return this.projectMapper.queryProjectById(p_id);
    }

    @Override
    public List<Project> queryProjects(String p_name) {
        return this.projectMapper.queryProjects(p_name);
    }

    @Override
    public List<Project> queryAllProjects() {
        return this.projectMapper.queryAllProjects();
    }


    @Override
    public List<Department> queryAllDepartments() {
        return this.departmentMapper.queryAllDepartments();
    }
}
