package com.kxg.stresstest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Niu Lilu
 * @Date: 2020/7/26 16:34
 * @Description:牛立露你写点注释吧！
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse<V> {
    private Integer pageNumber;
    private Integer pageSize;
    private Long total;
    private List<V> list;
}
