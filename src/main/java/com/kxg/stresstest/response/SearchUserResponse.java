package com.kxg.stresstest.response;

import com.kxg.stresstest.pojo.User;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:19
 * @Description:牛立露你写点注释吧！
 */
@Data
public class SearchUserResponse implements Serializable {
    private static final long serialVersionUID = 8394809129589463162L;

    private List<User> list;

    private Long total;
}
