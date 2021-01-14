package com.practice.ningbao.controller.company;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
import java.util.HashMap;
import java.util.Map;

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

    @ApiOperation("获取对应目录内容")
    @GetMapping("/get")
    public ResultEntity getContent(@ApiParam("目录ID") @RequestParam(required = false, defaultValue = "0") Integer dirId) {
        try {

            QueryWrapper<CompanyOverviewContentEntity> companyOverviewContentEntityQueryWrapper = new QueryWrapper<>();
            Map<String, Integer> stringIntegerMap = new HashMap<>();
            stringIntegerMap.put("owned_directory", dirId);
            companyOverviewContentEntityQueryWrapper.allEq(stringIntegerMap);
            return ResultUtil.success(companyOverviewContentService.getOne(companyOverviewContentEntityQueryWrapper));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("获取所有目录内容")
    @GetMapping("/list")
    public ResultEntity listContent() {
        try {
            return ResultUtil.success(companyOverviewContentService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改对应目录内容")
    @PostMapping("/modify")
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

