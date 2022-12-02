package com.hxc.enterprisestaffmanagement.entity;

public class Staff {
    private int staff_id;
    private String staff_name,staff_sex,staff_wage;
    private String staff_date;
    private Position position;

    public Staff(int staff_id, Position position, String staff_wage ) {
        this.staff_id = staff_id;
        this.staff_wage = staff_wage;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", staff_wage=" + staff_wage +
                ", staff_name='" + staff_name + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_date=" + staff_date +
                ", position=" + position +
                '}';
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_wage() {
        return staff_wage;
    }

    public void setStaff_wage(String staff_wage) {
        this.staff_wage = staff_wage;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_date() {
        return staff_date;
    }

    public void setStaff_date(String staff_date) {
        this.staff_date = staff_date;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public Staff(int staff_id, String staff_name, String staff_sex,Position position, String staff_date, String staff_wage) {
        this.staff_id = staff_id;
        this.staff_wage = staff_wage;
        this.staff_name = staff_name;
        this.staff_sex = staff_sex;
        this.staff_date = staff_date;
        this.position = position;
    }

    public Staff() {
    }
}
