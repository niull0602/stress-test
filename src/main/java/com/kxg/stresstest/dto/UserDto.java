package com.kxg.stresstest.dto;

import com.kxg.stresstest.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:48
 * @Description:牛立露你写点注释吧！
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;

    private String wordId;

    private String phoneNumber;

    private String password;

    private Short type;

    private Date createTime;

    private Date updateTime;

    private String chineseName;
    public static UserDto from(User user){
        return UserDto.builder()
                .id(user.getId())
                .phoneNumber(user.getPhoneNumber())
                .password(user.getPassword())
                .chineseName(user.getChineseName())
                .type(user.getType())
                .wordId(user.getWordId())
                .createTime(user.getCreateTime())
                .updateTime(user.getUpdateTime())
                .build();

    }
    public static List<UserDto> from(List<User> userList) {
        return userList.stream().map(UserDto::from).collect(Collectors.toList());
    }
}
