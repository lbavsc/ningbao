package com.practice.ningbao.service.news.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.news.NewsEntity;
import com.practice.ningbao.mapper.news.NewsMapper;
import com.practice.ningbao.service.news.NewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, NewsEntity> implements NewsService {

    @Override
    public IPage<NewsEntity> selectNewsPage(Page<NewsEntity> page, Integer newsType) {
        return baseMapper.selectPageVo(page, newsType);
    }
}
