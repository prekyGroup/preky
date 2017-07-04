package com.hand.service.impl;

import com.hand.domain.User;
import com.hand.mapper.UserMapper;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wankun on 2017/6/29.
 *
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void remove(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectByNum(String num) {
        return userMapper.selectByNum(num);
    }
}
