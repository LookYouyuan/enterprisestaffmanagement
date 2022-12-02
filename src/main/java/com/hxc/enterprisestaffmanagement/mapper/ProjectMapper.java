package com.hxc.enterprisestaffmanagement.mapper;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Project;
import com.hxc.enterprisestaffmanagement.entity.Staff;

import java.util.List;

public interface ProjectMapper {
    int addProject(Project project);
    int updateProject(Project project);
    int deleteProject(int p_id);
    Project queryProjectById(int p_id);
    List<Project> queryProjects(String p_name);
    List<Project> queryAllProjects();

    int deleteProjectByDe_id(int p_department_id );
}
