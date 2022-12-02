package com.hxc.enterprisestaffmanagement.mapper;


import com.hxc.enterprisestaffmanagement.entity.Staff;

import java.util.List;

public interface StaffMapper {
    int addStaff(Staff staff);
    int updateStaff(Staff staff);
    int deleteStaff(int staff_id);
    Staff queryStaffById(int staff_id);
    List<Staff> queryStaffByName(String staff_name);
    List<Staff> queryAllStaffs();

    int deleteStaffByPosition_id(int staff_position);
}
