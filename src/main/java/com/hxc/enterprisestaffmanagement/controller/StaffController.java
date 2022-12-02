package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.entity.Staff;
import com.hxc.enterprisestaffmanagement.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    public static final String SUCCESS = "redirect:queryAllStaffs";
    @RequestMapping("queryAllStaffs")
    public String queryAllPositions(ModelMap modelMap){
        modelMap.put("staffs",this.staffService.queryAllStaffs());
        return "staff/listStaff";
    }
    @RequestMapping("toAddStaff")
    public String toAddStaff(ModelMap modelMap){
        modelMap.put("positions",this.staffService.queryAllPositions());
        return "staff/addStaff";
    }
    @RequestMapping("doAddStaff")
    public String doAddStaff(Staff staff,int staff_position){
        Position position = new Position();
        position.setPosition_id(staff_position);
        staff.setPosition(position);
        this.staffService.addStaff(staff);
        return SUCCESS;
    }
    @RequestMapping("toUpdateStaff")
    public String toUpdateStaff(int staff_id,ModelMap modelMap){
        modelMap.put("staff",this.staffService.queryStaffById(staff_id));
        modelMap.put("positions",this.staffService.queryAllPositions());
        return "staff/updateStaff";
    }
    @RequestMapping("doUpdateStaff")
    public String doUpdateStaff(Staff staff,int staff_position){
        Position position = new Position();
        position.setPosition_id(staff_position);
        staff.setPosition(position);
        this.staffService.updateStaff(staff);
        return SUCCESS;
    }
    @RequestMapping("queryStaffByName")
    public String queryStaffByName(String staff_name,ModelMap modelMap){
        modelMap.put("staffs",this.staffService.queryStaffByName(staff_name));
        return "staff/listStaff";
    }

    @RequestMapping("doDeleteStaff")
    public String doDeleteStaff(int staff_id){
        this.staffService.deleteStaff(staff_id);
        return SUCCESS;
    }
}
