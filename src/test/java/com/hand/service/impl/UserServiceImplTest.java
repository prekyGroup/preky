package com.hand.service.impl;

import com.hand.domain.User;
import com.hand.mapper.UserMapper;
import com.hand.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wankun on 2017/7/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setUserId(1);
        user.setUserNum("U001");
        user.setUserName("tom");
        user.setUserPassword("123");
        user.setUserMail("haha@163.com");
        userService.save(user);
    }
    @Test
    public void remove() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void selectByNum() throws Exception {
        List<User> userList = userService.selectByNum("U001");
        for (User u : userList){
            userList.toString();
        }
    }

}