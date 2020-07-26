package com.kxg.stresstest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:36
 * @Description:牛立露你写点注释吧！
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private String message;

    public static ExceptionResponse of(String msg){
        return ExceptionResponse.builder().message(msg).build();
    }
}
