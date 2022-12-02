package com.hxc.enterprisestaffmanagement.Test;
import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.PositionMapper;
import org.junit.Test;

import javax.annotation.Resource;

public class PositionTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Test
    public void testAddPosition(){
        Department department = new Department();
        department.setDe_id(1502);
        Position position = new Position(150205, "部署中心副副主任", department);
        this.print(this.positionMapper.addPosition(position));
    }
    @Test
    public void testUpdatePosition(){
        Department department = new Department();
        department.setDe_id(1502);
        Position position = new Position(150216, "部署中心职员", department);
        this.print(this.positionMapper.updatePosition(position));
    }
    @Test
    public void testQueryPositionById(){
        int position_id=150202;
        this.positionMapper.queryPositionById(position_id);
    }
    @Test
    public void testQueryPositionByName(){
        String position_name="主任";
        this.positionMapper.queryPositionByName(position_name);
    }
    @Test
    public void testQueryAllPositions(){
        this.positionMapper.queryAllPositions();
    }
    @Test
    public void testQueryAllDepartments(){
        this.departmentMapper.queryAllDepartments();
    }

    @Test
    public void testDeletePosition(){

        this.positionMapper.deletePosition(150224);
    }
}
