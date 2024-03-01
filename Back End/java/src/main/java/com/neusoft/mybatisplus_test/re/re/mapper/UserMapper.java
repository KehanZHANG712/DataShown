package com.neusoft.mybatisplus_test.re.mapper;

import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@Mapper
@Repository("UserMapper")
public interface UserMapper  {
    @Insert("insert into user(user_password,user_first_name,user_last_name,user_email,user_name)" +
            "values(#{userPassword},#{userFirstName},#{userLastName},#{userEmail},#{userName})")
    void insertUser(User user);

    @Select("select user_password from user where user_id=#{userId}")
    String selectUser(int user_id);

    @Delete("delete from user where user_id = #{userId}")
    void deleteUser(int user_id);

    @Update("update user set user_first_name=#{userFirstName}, user_last_name=#{userLastName}, user_password=#{userPassword}, user_email=#{userEmail}, user_name=#{userName} " +
            "where user_id=#{userId}")
    void updateUser(User user);
}