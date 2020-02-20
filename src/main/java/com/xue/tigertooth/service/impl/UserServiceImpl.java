package com.xue.tigertooth.service.impl;
import com.github.pagehelper.PageHelper;
import com.xue.tigertooth.dao.UserDao;
import com.xue.tigertooth.pojo.User;
import com.xue.tigertooth.response.IntergerResponse;
import com.xue.tigertooth.response.LoginResponse;
import com.xue.tigertooth.response.UserListResponse;
import com.xue.tigertooth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by xueqi on 2020-01-25 16:41
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public IntergerResponse addUser(User user) {
        user.setRegTime(new Date());
        user.setRoleId(0);
        Integer res = userDao.addUser(user);
        IntergerResponse intergerResponse = new IntergerResponse();
        intergerResponse.setRes(res);
        return intergerResponse;
    }

    @Override
    public UserListResponse findAllUser(Integer pageNumber, Integer pageSize ) {
        PageHelper.startPage(pageNumber, pageSize);
        List<User> allUser = userDao.findAllUser();
        UserListResponse userListResponse = new UserListResponse();
        userListResponse.setUserList(allUser);
        return userListResponse;

    }

    @Override
    public UserListResponse findUserByName(String name) {
        List<User> userList = userDao.findUserByName(name);
        UserListResponse userListResponse = new UserListResponse();
        userListResponse.setUserList(userList);
        return userListResponse;
    }

    @Override
    public User findUSerByOne(Integer id) {
        return userDao.findUSerByOne(id);
    }

    @Override
    public IntergerResponse updateUser(User user) {
        user.setUpdateTime(new Date());
        Integer res = userDao.updateUser(user);
        IntergerResponse intergerResponse = new IntergerResponse();
        intergerResponse.setRes(res);
        return intergerResponse;

    }

    @Override
    public IntergerResponse deleteUser(Integer id) {
        Integer res = userDao.deleteUser(id);
        IntergerResponse intergerResponse = new IntergerResponse();
        intergerResponse.setRes(res);
        return intergerResponse;

    }

    @Override
    public IntergerResponse deleteUserList(List<Integer> ids) {
        Integer res = userDao.deleteUserList(ids);
        IntergerResponse intergerResponse = new IntergerResponse();
        intergerResponse.setRes(res);
        return intergerResponse;
    }

    @Override
    public LoginResponse userLogin(String phone, String password) {
        User user = userDao.userLogin(phone, password);
        LoginResponse loginResponse = new LoginResponse();

        loginResponse.setUser(user);
        return loginResponse;
    }
}
