package com.practice.ningbao.service.website.impl;

import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.practice.ningbao.mapper.website.CarouselNewsMapper;
import com.practice.ningbao.service.website.CarouselNewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.ningbao.vo.NewsLeaderboardVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class CarouselNewsServiceImpl extends ServiceImpl<CarouselNewsMapper, CarouselNewsEntity> implements CarouselNewsService {

    @Override
    public List<NewsLeaderboardVo> get() {
        return baseMapper.getVo();
    }
}
