package com.hxc.enterprisestaffmanagement.service.Impl;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.PositionMapper;
import com.hxc.enterprisestaffmanagement.mapper.StaffMapper;
import com.hxc.enterprisestaffmanagement.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private StaffMapper staffMapper;

    @Override
    public int addPosition(Position position) {
        return this.positionMapper.addPosition(position);
    }

    @Override
    public int updatePosition(Position position) {
        return this.positionMapper.updatePosition(position);
    }

    @Transient
    @Override
    public int deletePosition(int position_id) {
        this.staffMapper.deleteStaffByPosition_id(position_id);
        return this.positionMapper.deletePosition(position_id);
    }

    @Override
    public Position queryPositionById(int position_id) {
        return this.positionMapper.queryPositionById(position_id);
    }

    @Override
    public List<Position> queryPositionByName(String position_name) {
        return this.positionMapper.queryPositionByName(position_name);
    }

    @Override
    public List<Position> queryAllPositions() {
        return this.positionMapper.queryAllPositions();
    }

    @Override
    public List<Department> queryAllDepartments() {
        return this.departmentMapper.queryAllDepartments();
    }
}
