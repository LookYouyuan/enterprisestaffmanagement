package com.hxc.enterprisestaffmanagement.entity;

import java.util.Date;

public class Schedule{
    private int s_id;
    private Department department;
    private String s_date;
    private String s_name;

    @Override
    public String toString() {
        return "Schedule{" +
                "s_id=" + s_id +
                ", department=" + department +
                ", s_date=" + s_date +
                ", S_name='" + s_name + '\'' +
                '}';
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getS_date() {
        return s_date;
    }

    public void setS_date(String s_date) {
        this.s_date = s_date;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Schedule(int s_id, Department department, String s_date, String s_name) {
        this.s_id = s_id;
        this.department = department;
        this.s_date = s_date;
        this.s_name = s_name;
    }

    public Schedule() {
    }
}
