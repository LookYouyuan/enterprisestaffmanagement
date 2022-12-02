package com.hxc.enterprisestaffmanagement.entity;

import java.util.Date;

public class Project {
    private int p_id;
    private String p_name;
    private Department department;
    private String p_begin,p_end;

    @Override
    public String toString() {
        return "Project{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", department=" + department +
                ", p_begin=" + p_begin +
                ", p_end=" + p_end +
                '}';
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getP_begin() {
        return p_begin;
    }

    public void setP_begin(String p_begin) {
        this.p_begin = p_begin;
    }

    public String getP_end() {
        return p_end;
    }

    public void setP_end(String p_end) {
        this.p_end = p_end;
    }

    public Project(int p_id, String p_name, Department department, String p_begin, String p_end) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.department = department;
        this.p_begin = p_begin;
        this.p_end = p_end;
    }

    public Project(int p_id,String p_name, String p_begin, String p_end) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_begin = p_begin;
        this.p_end = p_end;
    }

    public Project() {
    }
}
