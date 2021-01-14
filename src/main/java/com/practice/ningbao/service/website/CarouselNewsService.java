package com.practice.ningbao.service.website;

import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.vo.NewsLeaderboardVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface CarouselNewsService extends IService<CarouselNewsEntity> {
    List<NewsLeaderboardVo> get();
}
