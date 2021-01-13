package com.practice.ningbao.controller.product;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.product.HomeProductIntroductionEntity;
import com.practice.ningbao.entity.product.ProductIntroductionContentEntity;
import com.practice.ningbao.service.product.HomeProductIntroductionService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-13
 */
@RestController
@RequestMapping("/home_product_introduction")
public class HomeProductIntroductionController {
    @Autowired
    HomeProductIntroductionService homeProductIntroductionService;

    @Autowired
    UserService userService;

    @ApiOperation("获取产品介绍内容")
    @GetMapping("/get")
    public ResultEntity getHomeProductIntroduction() {
        try {
            return ResultUtil.success(homeProductIntroductionService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("新增对应目录内容")
    @PostMapping("/add")
    public ResultEntity addHomeProductIntroduction(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                                   @ApiParam("内容对象") @RequestBody HomeProductIntroductionEntity homeProductIntroductionEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            homeProductIntroductionService.save(homeProductIntroductionEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("删除对应目录内容")
    @PostMapping("/delete")
    public ResultEntity deleteHomeProductIntroduction(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                                      @ApiParam("内容对象") @RequestBody HomeProductIntroductionEntity homeProductIntroductionEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            if (!homeProductIntroductionService.removeById(homeProductIntroductionEntity)) {
                return ResultUtil.error("1003", "移除错误");
            }
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改对应目录内容")
    @GetMapping("/modify")
    public ResultEntity modifyHomeProductIntroduction(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                                      @ApiParam("内容对象") @RequestBody HomeProductIntroductionEntity homeProductIntroductionEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            if (!homeProductIntroductionService.updateById(homeProductIntroductionEntity)) {
                return ResultUtil.error("1003", "修改错误");
            }
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

