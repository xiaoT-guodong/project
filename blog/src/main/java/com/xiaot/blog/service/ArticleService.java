package com.xiaot.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;

import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
public interface ArticleService extends IService<Article> {

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
