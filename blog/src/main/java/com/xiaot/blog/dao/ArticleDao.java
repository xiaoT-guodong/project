package com.xiaot.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article> {

    /**
     * 分页查询
     * @param articleDto articleDto
     * @return 文章列表
     */
    List<Map<String, Object>> page(ArticleDto articleDto);

    /**
     * 总条数
     * @param articleDto articleDto
     * @return 文章列表总条数
     */
    int pageCnt(ArticleDto articleDto);

}
