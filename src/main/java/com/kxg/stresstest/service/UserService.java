package com.kxg.stresstest.service;

import com.kxg.stresstest.pojo.User;
import com.kxg.stresstest.response.SearchUserResponse;

import java.util.List;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:06
 * @Description:牛立露你写点注释吧！
 */
public interface UserService {
    SearchUserResponse searchUserByPhoneNumber(User user);
}
