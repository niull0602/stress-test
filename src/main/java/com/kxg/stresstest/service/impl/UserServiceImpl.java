package com.kxg.stresstest.service.impl;

import com.kxg.stresstest.mapper.UserMapper;
import com.kxg.stresstest.pojo.User;
import com.kxg.stresstest.response.SearchUserResponse;
import com.kxg.stresstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.io.SequenceInputStream;
import java.util.List;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:06
 * @Description:牛立露你写点注释吧！
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public SearchUserResponse searchUserByPhoneNumber(User user) {
        Example example = new Example(User.class);
        example.createCriteria()
                .andLike("phoneNumber","%"+user.getPhoneNumber()+"%");
        List<User> userList=userMapper.selectByExample(example);
        SearchUserResponse response=new SearchUserResponse();
        response.setList(userList);
        return response;
    }
}
