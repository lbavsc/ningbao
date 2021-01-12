package com.practice.ningbao.service.news;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.news.NewsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.entity.user.UserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface NewsService extends IService<NewsEntity> {
    public IPage<NewsEntity> selectNewsPage(Page<NewsEntity> page, Integer newsType);
}
