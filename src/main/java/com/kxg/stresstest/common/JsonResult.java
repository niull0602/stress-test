package com.kxg.stresstest.common;

import com.kxg.stresstest.response.ResultResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:26
 * @Description:牛立露你写点注释吧！
 */
public class JsonResult {
    public static ResponseEntity success(HttpStatus httpStatus, Object object) {
        ResultResponse<Object> resultResponse = new ResultResponse<>();
        resultResponse.setCode(0);
        resultResponse.setMsg("success");
        resultResponse.setData(object);
        return ResponseEntity.status(httpStatus).body(resultResponse);
    }

    public static ResponseEntity success(HttpStatus httpStatus) {
        return success(httpStatus,null);
    }

    public static ResponseEntity error(HttpStatus httpStatus, String msg) {
        ResultResponse<Object> resultResponse = new ResultResponse();
        resultResponse.setCode(1);
        resultResponse.setMsg(msg);
        return ResponseEntity.status(httpStatus).body(resultResponse);
    }
}