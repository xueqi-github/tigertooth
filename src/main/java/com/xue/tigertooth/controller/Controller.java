package com.xue.tigertooth.controller;
import com.xue.tigertooth.common.SzpJsonResult;
import com.xue.tigertooth.pojo.User;
import com.xue.tigertooth.response.IntergerResponse;
import com.xue.tigertooth.response.LoginResponse;
import com.xue.tigertooth.response.UserListResponse;
import com.xue.tigertooth.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xueqi on 2020-02-11 19:45
 */
@Slf4j
@RestController
public class Controller {
//    http://localhost:8080/swagger-ui.html
    @Autowired
    UserService userService;
    //分页查询用户
    @ApiOperation("分页查询")
    @PostMapping("selectAllUser")
    public SzpJsonResult<UserListResponse> getAllUser(@RequestParam(value = "pageNumber",defaultValue ="1") Integer pageNumber,
                                          @RequestParam(value = "pageSize",defaultValue ="10")Integer pageSize){
        UserListResponse allUser = userService.findAllUser(pageNumber, pageSize);
        return SzpJsonResult.ok(allUser);
    }
    //通过姓名查询用户
    @PostMapping("seletUesrByName")
    public SzpJsonResult<UserListResponse> findUserByName(String name){
        UserListResponse allUser = userService.findUserByName(name);
        return SzpJsonResult.ok(allUser);
    }
    //id查询用户
    @PostMapping("selectUserById")
    public User findUSerByOne(int id){
        return userService.findUSerByOne(id);
    }
    //添加用户
    @PostMapping("addUser")
    public SzpJsonResult<IntergerResponse> findAllUser(@RequestBody User user){
        return  SzpJsonResult.ok(userService.addUser(user));
    }
    //更新用户
    @PostMapping("updateUser")
    public SzpJsonResult<IntergerResponse> updateUser(@RequestBody User user){

        return SzpJsonResult.ok(userService.updateUser(user));
    }
    //删除用户
    @PostMapping("deleteUser")
    public SzpJsonResult<IntergerResponse> deleteUser(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(userService.deleteUser(id));
    }
    //批量删除用户
    @PostMapping("deleteUsersById")
    public SzpJsonResult<IntergerResponse> deleteUserList(@RequestBody List<Integer> ids){
        return SzpJsonResult.ok(userService.deleteUserList(ids));
    }
    //登录验证
    @PostMapping("userLogin")
    public SzpJsonResult<LoginResponse> userLog(@RequestParam(value = "phone") String phone,
                                                @RequestParam(value = "password") String password){
        LoginResponse loginResponse = userService.userLogin(phone, password);
        return SzpJsonResult.ok(loginResponse);
    }

}
