package com.practice.ningbao.service.news.impl;

import com.practice.ningbao.entity.news.NewsLeaderboardEntity;
import com.practice.ningbao.mapper.news.NewsLeaderboardMapper;
import com.practice.ningbao.service.news.NewsLeaderboardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.ningbao.vo.NewsLeaderboardVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class NewsLeaderboardServiceImpl extends ServiceImpl<NewsLeaderboardMapper, NewsLeaderboardEntity> implements NewsLeaderboardService {

    @Override
    public List<NewsLeaderboardVo> get() {
        return baseMapper.getVo();
    }
}
