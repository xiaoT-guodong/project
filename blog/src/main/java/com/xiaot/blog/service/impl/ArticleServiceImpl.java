package com.xiaot.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaot.blog.dao.ArticleDao;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public List<Map<String, Object>> page(ArticleDto articleDto) {
        return articleDao.page(articleDto);
    }

    @Override
    public int pageCnt(ArticleDto articleDto) {
        return articleDao.pageCnt(articleDto);
    }

}
