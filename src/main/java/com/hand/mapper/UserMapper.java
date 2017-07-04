package com.hand.mapper;

import com.hand.domain.User;
import com.hand.util.BaseMapper;

import java.util.List;

/**
 * Created by wankun on 2017/6/29.
 * 
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查询用户By账号
     */
    List<User> selectByNum(String num);

}
