package com.practice.ningbao.service.news;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.news.NewsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.vo.NewsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface NewsService extends IService<NewsEntity> {
    public IPage<NewsVo> selectNewsPage(Page<NewsVo> page, Integer newsType);
}
