package com.orangee.service.impl;

import com.orangee.mapper.UsersMapper;
import com.orangee.pojo.Users;
import com.orangee.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:guoyucheng
 * @Date:2020/5/20
 */

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);

    }
}
