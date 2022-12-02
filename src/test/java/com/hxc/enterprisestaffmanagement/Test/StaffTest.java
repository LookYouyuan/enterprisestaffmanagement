package com.hxc.enterprisestaffmanagement.Test;

import com.hxc.enterprisestaffmanagement.EnterprisestaffmanagementApplicationTests;
import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.mapper.DepartmentMapper;
import com.hxc.enterprisestaffmanagement.mapper.PositionMapper;
import com.hxc.enterprisestaffmanagement.mapper.StaffMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaffTest extends EnterprisestaffmanagementApplicationTests {
    @Resource
    private StaffMapper staffMapper;
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Test
    public void testAddStaff(){
        Position position = new Position();
        position.setPosition_id(110101);
        Staff staff = new Staff(150208,"小狗","雄性",position,"2999-01-09","30000");
        this.print(this.staffMapper.addStaff(staff));
    }
    @Test
    public void testUpdateStaff(){
        Position position = new Position();
        position.setPosition_id(150101);
        Staff staff = new Staff(150201,"刘华清","男",position,"1999-01-09","35000");
        this.print(this.staffMapper.updateStaff(staff));
    }
    @Test
    public void testDeleteStaff(){
        int staff_id = 150202;
        this.print(this.staffMapper.deleteStaff(staff_id));
    }
    @Test
    public void testQueryStaffById(){
        int staff_id = 150202;
        this.staffMapper.queryStaffById(staff_id);
    }

    @Test
    public void testQueryStaffByName(){
        String staff_name = "小猪";
        this.staffMapper.queryStaffByName(staff_name);
    }
    @Test
    public void testQueryAllStaffs(){
        this.staffMapper.queryAllStaffs();
    }
  /*  @Test
    public void testQueryStaffs(){
        String staff_name="雷";
        this.staffMapper.queryStaffs(staff_name);
    }*/
    @Test
    public void testQueryAllPositions(){
        this.positionMapper.queryAllPositions();
    }
}
