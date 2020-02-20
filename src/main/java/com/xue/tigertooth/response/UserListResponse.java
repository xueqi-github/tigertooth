package com.xue.tigertooth.response;

import com.xue.tigertooth.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * Created by xueqi on 2020-02-14 19:55
 */
@Data
public class UserListResponse {
    private List<User> userList;
}
