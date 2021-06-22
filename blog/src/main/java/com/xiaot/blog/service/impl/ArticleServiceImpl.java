package com.xiaot.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaot.blog.dao.ArticleDao;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoT
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

    @Resource
    private ArticleDao articleDao;

}
