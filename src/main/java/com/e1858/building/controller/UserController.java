package com.e1858.building.controller;

import com.e1858.building.dao.UserMapper;
import com.e1858.building.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
*@Author Feng2018
*@Date 2018/3/6
*/
@RestController
public class UserController {

    @Autowired
    private UserMapper mUserMapper;

    @RequestMapping("/findUsers")
    public List<User> findAllUser(){
        return mUserMapper.findAllUser();
    };

    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") int id){
        return mUserMapper.findUserById(id);
    };
    @RequestMapping("/addUser")
    public boolean inserUser(@RequestParam("name")String name,@RequestParam("dept")String dept,
                          @RequestParam("phone")String phone,@RequestParam("website")String website){
        User user=new User();
        user.setName(name);
        user.setDept(dept);
        user.setPhone(phone);
        user.setWebsite(website);
      return  mUserMapper.insertUser(user);
    }
    @PostMapping("/updateUser")
    public boolean updateUser(@RequestParam("name")String name,@RequestParam("dept")String dept,
                              @RequestParam("phone")String phone,@RequestParam("website")String website,@RequestParam("id")int id){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setDept(dept);
        user.setPhone(phone);
        user.setWebsite(website);
        return mUserMapper.updateUser(user);
    };
    @RequestMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable("id")int id){
        return mUserMapper.deleteUser(id);
    }
}
