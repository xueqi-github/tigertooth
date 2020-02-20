package com.xue.tigertooth.service;

import com.xue.tigertooth.pojo.User;
import com.xue.tigertooth.response.IntergerResponse;
import com.xue.tigertooth.response.LoginResponse;
import com.xue.tigertooth.response.UserListResponse;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xueqi on 2020-01-25 16:38
 */
@Service
public interface UserService {


    UserListResponse findAllUser(Integer pageNumber, Integer pageSize);
    UserListResponse findUserByName(String name);
    User findUSerByOne(Integer id);
    IntergerResponse addUser(User user);
    IntergerResponse updateUser(User user);
    IntergerResponse deleteUser(Integer id);
    IntergerResponse deleteUserList(List<Integer> ids);
    LoginResponse userLogin(String phone, String password);

}
