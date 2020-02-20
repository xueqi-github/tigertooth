package com.xue.tigertooth.dao;

import com.xue.tigertooth.mapper.UserMapper;
import com.xue.tigertooth.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by xueqi on 2020-01-20 18:01
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;
    //查询
    public List<User> findAllUser(){
        return userMapper.selectAll();
    }

    public List<User> findUserByName(String name){
        Example example = new Example(User.class);
        example.createCriteria()
                .andLike("name","%"+name+"%");
        return userMapper.selectByExample(example);
    }

    public User findUSerByOne(int id){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id",id);
        return userMapper.selectOneByExample(example);
    }

    //添加
    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    public  Integer addUserList(List<User> userList){
        return userMapper.insertList(userList);
    }

    //删除
    public Integer deleteUser(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteUserList(List<Integer> ids){
        Example example = new Example(User.class);
        example.createCriteria()
                .andIn("id",ids);
        return userMapper.deleteByExample(example);
    }

    //更新
    public Integer updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }
    //登录
    public User userLogin(String phone, String password){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("phone",phone)
                .andEqualTo("password",password);
        
        return userMapper.selectOneByExample(example);
    }


}
