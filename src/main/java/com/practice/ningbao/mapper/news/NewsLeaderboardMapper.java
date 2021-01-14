package com.practice.ningbao.mapper.news;

import com.practice.ningbao.entity.news.NewsLeaderboardEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.ningbao.vo.NewsLeaderboardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Mapper
public interface NewsLeaderboardMapper extends BaseMapper<NewsLeaderboardEntity> {
    public List<NewsLeaderboardVo> getVo();
}
