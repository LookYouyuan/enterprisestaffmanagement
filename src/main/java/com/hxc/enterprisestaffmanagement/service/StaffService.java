package com.hxc.enterprisestaffmanagement.service;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;

import java.util.List;

public interface StaffService {

    int addStaff(Staff staff);
    int updateStaff(Staff staff);
    int deleteStaff(int staff_id);
    Staff queryStaffById(int staff_id);
    List<Staff> queryStaffByName(String staff_name);
    List<Staff> queryAllStaffs();
    List<Position> queryAllPositions();
}
