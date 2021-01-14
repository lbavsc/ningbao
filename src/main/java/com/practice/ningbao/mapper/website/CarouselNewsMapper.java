package com.practice.ningbao.mapper.website;

import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.ningbao.vo.NewsLeaderboardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Mapper
public interface CarouselNewsMapper extends BaseMapper<CarouselNewsEntity> {
    public List<NewsLeaderboardVo> getVo();
}
