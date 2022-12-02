package com.hxc.enterprisestaffmanagement.entity;



public class Department {

    private int de_id;
    private String de_name;
    private int de_belong_id;

    @Override
    public String toString() {
        return "Department{" +
                "de_id=" + de_id +
                ", de_name='" + de_name + '\'' +
                ", de_belong_id=" + de_belong_id +
                '}';
    }

    public int getDe_id() {
        return de_id;
    }

    public void setDe_id(int de_id) {
        this.de_id = de_id;
    }

    public String getDe_name() {
        return de_name;
    }

    public void setDe_name(String de_name) {
        this.de_name = de_name;
    }

    public int getDe_belong_id() {
        return de_belong_id;
    }

    public void setDe_belong_id(int de_belong_id) {
        this.de_belong_id = de_belong_id;
    }

    public Department(int de_id, String de_name, int de_belong_id) {
        this.de_id = de_id;
        this.de_name = de_name;
        this.de_belong_id = de_belong_id;
    }

    public Department() {
    }
}
