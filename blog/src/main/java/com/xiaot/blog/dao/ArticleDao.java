package com.xiaot.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaot.blog.po.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoT
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article> {



}
