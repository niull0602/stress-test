package com.kxg.stresstest.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 17:22
 * @Description:牛立露你写点注释吧！
 */
@Data
public class SearchUserRequest implements Serializable {
    private static final long serialVersionUID = -2217161919886057697L;
    private String phoneNumber;
}
