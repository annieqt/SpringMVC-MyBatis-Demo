package com.springapp.mvc.mapper;


import com.springapp.mvc.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Tian Wang on 2015/3/24.
 */

public interface UserMapper {
    @Insert("insert into user(name, password) values(#{name}, #{password})")
    public void add(User user);

    @Update("update user set name=#{name}, password=#{password} where id=#{id}")
    public void update(User user);

    @Select("select * from user where id=#{id}")
    public User findById(long id);

    @Select("select * from user")
    public List<User> findAll();

    @Delete("delete from user where id=#{id}")
    public void delete(long id);

}