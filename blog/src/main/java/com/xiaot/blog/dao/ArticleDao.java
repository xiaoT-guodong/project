package com.xiaot.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.vo.ArticleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    List<ArticleVo> page(ArticleDto articleDto);

    /**
     * 总条数
     * @param articleDto articleDto
     * @return 文章列表总条数
     */
    int pageCnt(ArticleDto articleDto);

}
