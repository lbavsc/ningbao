package com.practice.ningbao.controller.news;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.news.NewsLeaderboardEntity;
import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.practice.ningbao.service.news.NewsLeaderboardService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *  前端控制器
 * </p>
 * 新闻排行榜
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


    @ApiOperation("获得轮播排行榜")
    @GetMapping("/get")
    public ResultEntity getCarouselNews() {
        try {
            return ResultUtil.success(newsLeaderboardService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("删除轮播新闻")
    @GetMapping("/delete")
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

    @ApiOperation("新增轮播新闻")
    @GetMapping("/add")
    public ResultEntity addCarouselNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                        @ApiParam("新闻") @RequestBody NewsLeaderboardEntity newsLeaderboardEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsLeaderboardService.save(newsLeaderboardEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }
}

