package com.neusoft.mybatisplus_test.re.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.User;
import com.neusoft.mybatisplus_test.re.service.AdminService;
import com.neusoft.mybatisplus_test.re.service.SuperadminService;
import com.neusoft.mybatisplus_test.re.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@RestController
@RequestMapping("/re/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AdminService adminService;
    @Autowired
    SuperadminService superadminService;

    @PostMapping("insertUser")
    @CrossOrigin
    public void insertUser(@RequestBody JSONObject jsonObject) {
        String userPassword = jsonObject.getString("userPassword");
        String userFirstName = jsonObject.getString("userFirstName");
        String userLastName = jsonObject.getString("userLastName");
        String userEmail = jsonObject.getString("userEmail");
        String userName = jsonObject.getString("userName");
        User user1 = new User(userPassword,userFirstName,userLastName,userEmail,userName);
        System.out.println(user1);
        userService.insertUser(user1);

    }

    @PostMapping("deleteUser")
    @CrossOrigin
    public void deleteUser(@RequestBody JSONObject jsonObject) {
        Integer userId = Integer.parseInt(jsonObject.getString("userId"));
        userService.deleteUser(userId);

    }

    @PostMapping("updateUser")
    @CrossOrigin
    public void updateUser(@RequestBody JSONObject jsonObject) {
        Integer userId = Integer.parseInt(jsonObject.getString("userId"));
        String userPassword = jsonObject.getString("userPassword");
        String userFirstName = jsonObject.getString("userFirstName");
        String userLastName = jsonObject.getString("userLastName");
        String userEmail = jsonObject.getString("userEmail");
        String userName = jsonObject.getString("userName");
        User user = new User(userId,userPassword,userFirstName,userLastName,userEmail,userName);
        userService.updateUser(user);

    }

    @PostMapping("selectUser")
    @CrossOrigin
    public int selectUser(@RequestBody JSONObject jsonObject) {
        Integer userId = Integer.parseInt(jsonObject.getString("userId"));
        String userPassword = jsonObject.getString("userPassword");
        if(userService.selectUser(userId).equals(userPassword)){
            return 1;
        }else{
            return 0;
        }

    }

    @PostMapping("Login")
    @CrossOrigin
    public int Login(@RequestBody JSONObject jsonObject) {
        Integer userId = Integer.parseInt(jsonObject.getString("userId"));
        String userPassword = jsonObject.getString("userPassword");
        if(userService.selectUser(userId) != null){
            if(userService.selectUser(userId).equals(userPassword)){
                return 2;}
        }else if(adminService.selectAdmin(userId) != null){
            if(adminService.selectAdmin(userId).equals(userPassword)){
                return 1;}

        }else if(superadminService.selectSuperAdmin(userId) != null){
            if(superadminService.selectSuperAdmin(userId).equals(userPassword)){
                return 3;}
        }
        return 0;
    }

}
