package com.practice.ningbao.mapper.news;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.news.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.ningbao.entity.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Mapper
public interface NewsMapper extends BaseMapper<NewsEntity> {
    IPage<NewsEntity> selectPageVo(Page<?> page, Integer news_type);
}
