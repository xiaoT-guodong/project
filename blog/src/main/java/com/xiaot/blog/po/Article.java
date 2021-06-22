package com.xiaot.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaot.common.entity.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xiaoT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("blog_article")
public class Article extends Date {

    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否删除
     */
    private Integer isDelete;

}
