package com.neusoft.mybatisplus_test.re.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.Cohort;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;
import com.neusoft.mybatisplus_test.re.entity.User;
import com.neusoft.mybatisplus_test.re.service.AdminService;
import com.neusoft.mybatisplus_test.re.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@RestController
@RequestMapping("/re/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("deleteAdmin")
    @CrossOrigin
    public void deleteAdmin(@RequestBody JSONObject jsonObject) {
        Integer adminId = Integer.parseInt(jsonObject.getString("adminId"));
        adminService.deleteAdmin(adminId);

    }

    @PostMapping("updateAdmin")
    @CrossOrigin
    public void updateAdmin(@RequestBody JSONObject jsonObject) {
        Integer adminId = Integer.parseInt(jsonObject.getString("adminId"));
        String adminPassword = jsonObject.getString("adminPassword");
        String adminFirstName = jsonObject.getString("adminFirstName");
        String adminLastName = jsonObject.getString("adminLastName");
        String adminEmail = jsonObject.getString("adminEmail");
        String adminName = jsonObject.getString("adminName");
        Admin admin = new Admin(adminId,adminPassword,adminFirstName,adminLastName,adminEmail,adminName);
        adminService.updateAdmin(admin);

    }

    @PostMapping("selectAdmin")
    @CrossOrigin
    public int selectAdmin(@RequestBody JSONObject jsonObject) {
        Integer adminId = Integer.parseInt(jsonObject.getString("adminId"));
        String adminPassword = jsonObject.getString("adminPassword");
        if(adminService.selectAdmin(adminId).equals(adminPassword)){
            return 1;
        }else{
            return 0;
        }

    }

    @RequestMapping("selectAllAdmin")
    @CrossOrigin
    public List<Admin> selectAllAdmin() {
        return adminService.selectAllAdmin();

    }

    @PostMapping("insertAdmin")
    @CrossOrigin
    public void insertAdmin(@RequestBody JSONObject jsonObject) {
        String adminPassword = jsonObject.getString("adminPassword");
        String adminFirstName = jsonObject.getString("adminFirstName");
        String adminLastName = jsonObject.getString("adminLastName");
        String adminEmail = jsonObject.getString("adminEmail");
        String adminName = jsonObject.getString("adminName");
        Admin admin = new Admin(adminPassword,adminFirstName,adminLastName,adminEmail,adminName);
        System.out.println(admin);
        adminService.insertAdmin(admin);

    }

}
