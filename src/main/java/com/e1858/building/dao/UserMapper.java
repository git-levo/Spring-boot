package com.e1858.building.dao;

/*
*@Author Feng2018
*@Date 2018/3/6
*/

import com.e1858.building.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

   //查询所有用户信息
    public List<User> findAllUser();
    //根据ID查询用户的信息
    public User findUserById(int id) ;

    //添加用户
    public boolean insertUser(User user);

    //更新用户
    public boolean updateUser(User user);

    //删除用户
    public boolean deleteUser(int id);
}
