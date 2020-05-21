package com.orangee.mapper;

import com.orangee.pojo.Users;

import java.util.List;

/**
 * @Author:guoyucheng
 * @Date:2020/5/13
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUsersAll();
}
