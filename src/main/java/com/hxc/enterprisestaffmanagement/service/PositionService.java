package com.hxc.enterprisestaffmanagement.service;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;

import java.util.List;

public interface PositionService {
    int addPosition(Position position);
    int updatePosition(Position position);
    int deletePosition(int position_id);
    Position queryPositionById(int position_id);
    List<Position> queryPositionByName(String position_name);
    List<Position> queryAllPositions();
    List<Department> queryAllDepartments();

}
