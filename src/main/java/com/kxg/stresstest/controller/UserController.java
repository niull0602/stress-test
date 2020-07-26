package com.kxg.stresstest.controller;

import com.kxg.stresstest.common.JsonResult;
import com.kxg.stresstest.common.SzpJsonResult;
import com.kxg.stresstest.dto.UserDto;
import com.kxg.stresstest.pojo.User;
import com.kxg.stresstest.request.SearchUserRequest;
import com.kxg.stresstest.response.SearchUserResponse;
import com.kxg.stresstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:牛立露你写点注释吧！
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:05
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * @Description:
     * @Author: Niulilu
     * @Date: 2020/7/26 17:00
     * @Param: [phoneNumber]
     * @Return: org.springframework.http.ResponseEntity
     */
    @PostMapping("search/user")
    public SzpJsonResult<SearchUserResponse> searchUserByPhoneNumber(@RequestBody SearchUserRequest searchUserRequest){
        User user = new User();
        user.setPhoneNumber(searchUserRequest.getPhoneNumber());
        SearchUserResponse response = userService.searchUserByPhoneNumber(user);
        return SzpJsonResult.ok(response);
    }

}
