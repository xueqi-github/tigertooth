package com.xue.tigertooth.response;

import com.xue.tigertooth.pojo.User;
import lombok.Data;

import javax.servlet.http.HttpSession;

/**
 * Created by xueqi on 2020-02-14 18:43
 */
@Data
public class LoginResponse {
    User user;
}
