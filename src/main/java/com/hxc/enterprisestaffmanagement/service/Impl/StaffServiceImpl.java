package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.mapper.PositionMapper;
import com.hxc.enterprisestaffmanagement.mapper.StaffMapper;
import com.hxc.enterprisestaffmanagement.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;
    @Resource
    private PositionMapper positionMapper;
    @Override
    public int addStaff(Staff staff) {
        return this.staffMapper.addStaff(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return this.staffMapper.updateStaff(staff);
    }

    @Override
    public int deleteStaff(int staff_id) {
        return this.staffMapper.deleteStaff(staff_id);
    }

    @Override
    public Staff queryStaffById(int staff_id) {
        return this.staffMapper.queryStaffById(staff_id);
    }

    @Override
    public List<Staff> queryStaffByName(String staff_name) {
        return this.staffMapper.queryStaffByName(staff_name);
    }

    @Override
    public List<Staff> queryAllStaffs() {
        return this.staffMapper.queryAllStaffs();
    }

    @Override
    public List<Position> queryAllPositions() {
        return this.positionMapper.queryAllPositions();
    }

}
