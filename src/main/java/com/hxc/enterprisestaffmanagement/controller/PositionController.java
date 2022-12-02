package com.hxc.enterprisestaffmanagement.controller;

import com.hxc.enterprisestaffmanagement.entity.Department;
import com.hxc.enterprisestaffmanagement.entity.Position;
import com.hxc.enterprisestaffmanagement.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    public static final String SUCCESS = "redirect:queryAllPositions";
    @RequestMapping("queryAllPositions")
    public String queryAllStrudents(Position position, ModelMap modelMap){
        modelMap.put("positions",this.positionService.queryAllPositions());
        //部门下拉列表需要所有部门信息
        //modelMap.put("departments",this.positionService.queryAllDepartments());
        return "position/listPosition";
    }
    @RequestMapping("queryPositionByName")
    public String queryPositionByName(String position_name,ModelMap modelMap){
        modelMap.put("positions",this.positionService.queryPositionByName(position_name));

        return "position/listPosition";
    }


    @RequestMapping("toAddPosition")
    public String toAddPosition(ModelMap modelMap){
        modelMap.put("departments",this.positionService.queryAllDepartments());
        return "position/addPosition";
    }
    @RequestMapping("doAddPosition")
    public String doAddPosition(Position position,int position_de_id){
        Department department = new Department();
        department.setDe_id(position_de_id);
        position.setDepartment(department);
        this.positionService.addPosition(position);
        return SUCCESS;
    }

    @RequestMapping("toUpdatePosition")
    public String toUpdatePosition(int position_id,ModelMap modelMap){
        modelMap.put("position",this.positionService.queryPositionById(position_id));
        modelMap.put("departments",this.positionService.queryAllDepartments());
        return "position/updatePosition";
    }
    @RequestMapping("doUpdatePosition")
    public String doUpdatePosition(Position position, int position_de_id){
        Department department = new Department();
        department.setDe_id(position_de_id);
        position.setDepartment(department);
        this.positionService.updatePosition(position);
        return SUCCESS;
    }
    @RequestMapping("doDeletePosition")
    public String doDeletePosition(int position_id){
        this.positionService.deletePosition(position_id);
        return SUCCESS;
    }
}
