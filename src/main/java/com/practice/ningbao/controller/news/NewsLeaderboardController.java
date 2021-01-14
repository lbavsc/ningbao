package com.practice.ningbao.controller.news;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.news.NewsLeaderboardEntity;
import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.practice.ningbao.service.news.NewsLeaderboardService;
import com.practice.ningbao.service.news.NewsService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 * 新闻排行榜
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/news_leaderboard")
public class NewsLeaderboardController {
    @Autowired
    UserService userService;
    @Autowired
    NewsLeaderboardService newsLeaderboardService;


    @Autowired
    NewsService newsService;

    @ApiOperation("获得排行榜")
    @GetMapping("/get")
    public ResultEntity getCarouselNews() {
        try {
            return ResultUtil.success(newsLeaderboardService.get());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("删除排行榜新闻")
    @PostMapping("/delete")
    public ResultEntity deleteCarouselNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                           @ApiParam("新闻") @RequestBody NewsLeaderboardEntity newsLeaderboardEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsLeaderboardService.removeById(newsLeaderboardEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("新增排行榜新闻")
    @PostMapping("/add")
    public ResultEntity addCarouselNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                        @ApiParam("新闻") @RequestBody NewsLeaderboardEntity newsLeaderboardEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            if (newsService.getById(newsLeaderboardEntity.getNewsId()) == null) {
                return ResultUtil.error("1003", "系统中没有此条新闻");
            }
            newsLeaderboardService.save(newsLeaderboardEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }
}

