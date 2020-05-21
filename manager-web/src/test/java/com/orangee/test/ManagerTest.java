package com.orangee.test;

import com.orangee.mapper.UsersMapper;
import com.orangee.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:guoyucheng
 * @Date:2020/5/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUser(){
        Users users = new Users();
        users.setUserage(2000);
        users.setUsername("mona");
        this.usersMapper.insertUser(users );
    }
}
