package com.xiaot.blog.controller;

import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.service.ArticleService;
import com.xiaot.common.controller.BaseController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiaoT
 * 文章
 */
@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController {

    @Resource
    ArticleService articleService;

    /**
     * 列表
     */
    @GetMapping
    public Map<String, Object> list(ArticleDto articleDto) {
        return page(articleService.pageCnt(articleDto), articleService.page(articleDto));
    }

    /**
     * 新增
     */
    @PostMapping
    public Map<String, Object> save(Article article) {
        return update(articleService.save(article));
    }

    /**
     * 修改
     */
    @PutMapping
    public Map<String, Object> update(Article article) {
        return update(articleService.updateById(article));
    }

    /**
     * 逻辑删除
     */
    @DeleteMapping
    public Map<String, Object> delete(Integer id) {
        return update(articleService.removeById(id));
    }

}
