package com.xiaot.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.vo.ArticleVo;

import java.util.List;

/**
 * @author xiaoT
 */
public interface ArticleService extends IService<Article> {

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
