package com.hxc.enterprisestaffmanagement.mapper;


import com.hxc.enterprisestaffmanagement.entity.Position;

import java.util.List;

public interface PositionMapper  {
    int addPosition(Position position);
    int updatePosition(Position position);
    int deletePosition(int position_id);
    Position queryPositionById(int position_id);
    List<Position> queryPositionByName(String position_name);
    List<Position> queryAllPositions();

    int deletePositionByDe_id(int p_de_id);
}
