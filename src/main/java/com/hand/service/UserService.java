package com.hand.service;

import com.hand.domain.User;

import java.util.List;

/**
 * Created by wankun on 2017/6/29.
 *
 */
public interface UserService {
    /**
     * 添加用户
     */
    void save(User user);

    /**
     * 根据Id删除用户
     */
    void remove(Integer id);

    /**
     * 添加用户
     */
    void update(User user);

    /**
     * 根据账号查询用户
     */
    List<User> selectByNum(String num);
}
