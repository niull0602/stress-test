package com.kxg.stresstest.response;

import lombok.Data;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:28
 * @Description:牛立露你写点注释吧！
 */
@Data
public class ResultResponse<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}
