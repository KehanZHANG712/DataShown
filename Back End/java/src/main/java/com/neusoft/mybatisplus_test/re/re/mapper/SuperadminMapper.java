package com.neusoft.mybatisplus_test.re.mapper;

import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.Cohort;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.neusoft.mybatisplus_test.re.entity.Superadmin;

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
@Repository("SuperadminMapper")
public interface SuperadminMapper  {

    @Select("select super_admin_password from superadmin where super_admin_id=#{superAdminId}")
    String selectSuperAdmin(int super_admin_id);

    @Delete("delete from superadmin where super_admin_id = #{superAdminId}")
    void deleteCSuperAdmin(int super_admin_id);

    @Update("update superadmin set super_admin_first_name=#{superAdminFirstName}, super_admin_last_name=#{superAdminLastName}, super_admin_password=#{superAdminPassword}, super_admin_email=#{superAdminEmail}, super_admin_name=#{superAdminName} " +
            "where super_admin_id=#{superAdminId}")
    void updateSuperAdmin(Superadmin superadmin);

    @Select("select * from superadmin")
    List<Superadmin> selectAllSuperadmin();

    @Insert("insert into superadmin(super_admin_password,super_admin_first_name,super_admin_last_name,super_admin_email,super_admin_name)" +
            "values(#{superAdminPassword},#{superAdminFirstName},#{superAdminLastName},#{superAdminEmail},#{superAdminName})")
    void insertSuperAdmin(Superadmin superadmin);

}