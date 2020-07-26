package com.kxg.stresstest.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description:牛立露你写点注释吧！
 * @Author: Niu Lilu
 * @Date: 2020/7/26 15:52
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
