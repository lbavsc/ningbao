package com.practice.ningbao.controller.company;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.company.CompanyOverviewContentEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.service.company.CompanyOverviewContentService;
import com.practice.ningbao.service.news.NewsService;
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
 * 公司概况内容
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/company_overview_content")
public class CompanyOverviewContentController {
    @Autowired
    UserService userService;

    @Autowired
    CompanyOverviewContentService companyOverviewContentService;


    //// TODO: 2021/1/11 获取对应目录内容
    @ApiOperation("获取对应目录内容")
    @GetMapping("/get")
    public ResultEntity getContent(@ApiParam("目录ID") @RequestParam(required = false, defaultValue = "0") Integer dirId) {
        try {
            return ResultUtil.success(companyOverviewContentService.getById(dirId));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    //// TODO: 2021/1/11 修改内容
    @ApiOperation("获取对应目录内容")
    @GetMapping("/modify")
    public ResultEntity modifyContent(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                      @ApiParam("内容对象") @RequestBody CompanyOverviewContentEntity companyOverviewContentEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            companyOverviewContentService.updateById(companyOverviewContentEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


}

