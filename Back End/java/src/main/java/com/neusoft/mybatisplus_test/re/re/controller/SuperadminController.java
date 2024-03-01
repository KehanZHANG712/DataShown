package com.neusoft.mybatisplus_test.re.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;
import com.neusoft.mybatisplus_test.re.service.SuperadminService;
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
@RequestMapping("/re/superadmin")
public class SuperadminController {

    @Autowired
    SuperadminService superadminService;

    @PostMapping("deleteSuperAdmin")
    @CrossOrigin
    public void deleteSuperAdmin(@RequestBody JSONObject jsonObject) {
        Integer superAdminId = Integer.parseInt(jsonObject.getString("superAdminId"));
        superadminService.deleteSuperAdmin(superAdminId);

    }

    @PostMapping("updateSuperAdmin")
    @CrossOrigin
    public void updateSuperAdmin(@RequestBody JSONObject jsonObject) {
        Integer superAdminId = Integer.parseInt(jsonObject.getString("superAdminId"));
        String superAdminPassword = jsonObject.getString("superAdminPassword");
        String superAdminFirstName = jsonObject.getString("superAdminFirstName");
        String superAdminLastName = jsonObject.getString("superAdminLastName");
        String superAdminEmail = jsonObject.getString("superAdminEmail");
        String superAdminName = jsonObject.getString("superAdminName");
        Superadmin superadmin = new Superadmin(superAdminId,superAdminFirstName,superAdminLastName,superAdminPassword,superAdminEmail,superAdminName);
        superadminService.updateSuperAdmin(superadmin);

    }

    @PostMapping("selectSuperAdmin")
    @CrossOrigin
    public int selectSuperAdmin(@RequestBody JSONObject jsonObject) {
        Integer superAdminId = Integer.parseInt(jsonObject.getString("superAdminId"));
        String superAdminPassword = jsonObject.getString("superAdminPassword");
        if(superadminService.selectSuperAdmin(superAdminId).equals(superAdminPassword)){
            return 1;
        }else{
            return 0;
        }

    }


    @RequestMapping("selectAllSuperadmin")
    @CrossOrigin
    public List<Superadmin> selectAllSuperadmin() {
        return superadminService.selectAllSuperadmin();

    }

    @PostMapping("insertSuperadmin")
    @CrossOrigin
    public void insertSuperAdmin(@RequestBody JSONObject jsonObject) {
        String superAdminPassword = jsonObject.getString("superAdminPassword");
        String superAdminFirstName = jsonObject.getString("superAdminFirstName");
        String superAdminLastName = jsonObject.getString("superAdminLastName");
        String superAdminEmail = jsonObject.getString("superAdminEmail");
        String superAdminName = jsonObject.getString("superAdminName");
        Superadmin superadmin = new Superadmin(superAdminFirstName,superAdminLastName,superAdminPassword,superAdminEmail,superAdminName);
        System.out.println(superadmin);
        superadminService.insertSuperAdmin(superadmin);

    }

}
