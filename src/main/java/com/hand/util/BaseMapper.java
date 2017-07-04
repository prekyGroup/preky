package com.hand.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by huiyu.chen on 2017/7/4.
 *
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
