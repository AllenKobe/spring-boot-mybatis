package com.lance.mybatis.web;

import com.lance.mybatis.domain.Department;
import com.lance.mybatis.service.DepartmentService;
import com.lance.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/index")
    public  String index(Model model){
        List<Department> departments=departmentService.findAll();
        model.addAttribute("departments",departments);
        return  "index.jsp";
    }
    @RequestMapping("/add")
    public  String add(){
        return  "depart_add.jsp";
    }
    @RequestMapping("/toAdd")
    public  String toAdd(String name,String number){
        Department dept=new Department();
        dept.setDepartmentName(name);
        dept.setDepartmentNumber(number);
        departmentService.insert(dept);
        return  "redirect:/test/index";
    }

    @RequestMapping("/upd")
    public  String upd(Model model,Integer id){
        Department dept=departmentService.findOne(id);
        model.addAttribute("dept",dept);
        return  "depart_upd.jsp";
    }
    @RequestMapping("/toUpd")
    public  String toUpd(Model model,Integer id,String name,String number){
        Department dept=departmentService.findOne(id);
        dept.setDepartmentName(name);
        dept.setDepartmentNumber(number);
        departmentService.update(dept);
        return  "redirect:/test/index";
    }

    @RequestMapping("/del")
    public  String del(Integer id){
        departmentService.delete(id);
        return  "redirect:/test/index";
    }
}
