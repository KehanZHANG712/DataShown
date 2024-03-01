package com.neusoft.mybatisplus_test.re.service;

import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;
import com.neusoft.mybatisplus_test.re.mapper.SuperadminMapper;
import com.neusoft.mybatisplus_test.re.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperadminService {
    @Autowired
    SuperadminMapper superadminMapper;

    public String selectSuperAdmin(int super_admin_id){return superadminMapper.selectSuperAdmin(super_admin_id);}

    public void updateSuperAdmin(Superadmin superadmin){superadminMapper.updateSuperAdmin(superadmin);}

    public void deleteSuperAdmin(int super_admin_id){superadminMapper.deleteCSuperAdmin(super_admin_id);}

    public List<Superadmin> selectAllSuperadmin(){return superadminMapper.selectAllSuperadmin();}

    public void insertSuperAdmin(Superadmin superadmin){superadminMapper.insertSuperAdmin(superadmin);}
}