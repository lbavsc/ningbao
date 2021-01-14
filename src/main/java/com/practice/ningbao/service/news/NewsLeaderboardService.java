package com.practice.ningbao.service.news;

import com.practice.ningbao.entity.news.NewsLeaderboardEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.vo.NewsLeaderboardVo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface NewsLeaderboardService extends IService<NewsLeaderboardEntity> {

    List<NewsLeaderboardVo> get();
}
