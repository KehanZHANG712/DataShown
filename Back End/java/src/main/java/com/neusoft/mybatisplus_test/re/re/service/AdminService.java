package com.neusoft.mybatisplus_test.re.service;

import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;
import com.neusoft.mybatisplus_test.re.mapper.AdminMapper;
import com.neusoft.mybatisplus_test.re.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    public String selectAdmin(int admin_id){return adminMapper.selectAdmin(admin_id);}

    public void updateAdmin(Admin admin){adminMapper.updateAdmin(admin);}

    public void deleteAdmin(int admin_id){adminMapper.deleteAdmin(admin_id);}

    public List<Admin> selectAllAdmin(){return adminMapper.selectAllAdmin();}

    public void insertAdmin(Admin admin){adminMapper.insertAdmin(admin);}
}