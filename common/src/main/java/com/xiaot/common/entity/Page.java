package com.xiaot.common.entity;

import lombok.Data;

/**
 * @author xiaoT
 */
@Data
public class Page {

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 条数
     */
    private Integer pageSize;

    /**
     * 获取分页起始位置
     * @return (pageNo - 1) * pageSize
     */
    public Integer getPageNo() {
        if (pageNo == null || pageSize == null) {
            return 0;
        }
        return (pageNo - 1) * pageSize;
    }

    /**
     * 获取条数
     * @return pageSize == null ? 0 : pageSize
     */
    public Integer getPageSize() {
        return pageSize == null ? 0 : pageSize;
    }
}
