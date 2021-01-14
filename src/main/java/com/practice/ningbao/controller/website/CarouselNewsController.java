package com.practice.ningbao.controller.website;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.website.CarouselNewsEntity;
import com.practice.ningbao.service.news.NewsService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.service.website.CarouselNewsService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 * 轮播新闻
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/carousel_news")
public class CarouselNewsController {
    @Autowired
    UserService userService;
    @Autowired
    CarouselNewsService carouselNewsService;

    @Autowired
    NewsService newsService;

    @ApiOperation("获得轮播新闻")
    @GetMapping("/get")
    public ResultEntity getCarouselNews() {
        try {
            return ResultUtil.success(carouselNewsService.get());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("删除轮播新闻")
    @PostMapping("/delete")
    public ResultEntity deleteCarouselNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                           @ApiParam("新闻") @RequestBody CarouselNewsEntity carouselNewsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            carouselNewsService.removeById(carouselNewsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("新增轮播新闻")
    @PostMapping("/add")
    public ResultEntity addCarouselNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                        @ApiParam("新闻") @RequestBody CarouselNewsEntity carouselNewsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            carouselNewsService.save(carouselNewsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }
}

