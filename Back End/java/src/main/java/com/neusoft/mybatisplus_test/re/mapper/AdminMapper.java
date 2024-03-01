package com.neusoft.mybatisplus_test.re.mapper;

import com.neusoft.mybatisplus_test.re.entity.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.neusoft.mybatisplus_test.re.entity.Admin;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@Mapper
@Repository("AdminMapper")
public interface AdminMapper  {

    @Select("select admin_password from admin where admin_id=#{adminId}")
    String selectAdmin(int admin_id);

    @Delete("delete from admin where admin_id = #{adminId}")
    void deleteAdmin(int admin_id);

    @Update("update admin set admin_first_name=#{adminFirstName}, admin_last_name=#{adminLastName}, admin_password=#{adminPassword}, admin_email=#{adminEmail}, admin_name=#{adminName} " +
            "where admin_id=#{adminId}")
    void updateAdmin(Admin admin);

    @Select("select * from admin")
    List<Admin> selectAllAdmin();

    @Insert("insert into admin(admin_password,admin_first_name,admin_last_name,admin_email,admin_name)" +
            "values(#{adminPassword},#{adminFirstName},#{adminLastName},#{adminEmail},#{adminName})")
    void insertAdmin(Admin admin);


}