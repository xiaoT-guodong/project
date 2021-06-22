package com.xiaot.blog.controller;

import com.xiaot.blog.service.ArticleService;
import com.xiaot.common.controller.BaseController;
import com.xiaot.common.dto.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xiaoT
 */
@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController {

    @Resource
    ArticleService articleService;

    /**
     * 列表
     */
    @GetMapping
    public Map<String, Object> list(Page page) {
        return page(articleService.count(), articleService.list());
    }

}
