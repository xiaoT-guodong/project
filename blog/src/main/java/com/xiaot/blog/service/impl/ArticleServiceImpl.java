package com.xiaot.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaot.blog.dao.ArticleDao;
import com.xiaot.blog.dto.ArticleDto;
import com.xiaot.blog.po.Article;
import com.xiaot.blog.service.ArticleService;
import com.xiaot.blog.vo.ArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoT
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public List<ArticleVo> page(ArticleDto articleDto) {
        return articleDao.page(articleDto);
    }

    @Override
    public int pageCnt(ArticleDto articleDto) {
        return articleDao.pageCnt(articleDto);
    }

}
