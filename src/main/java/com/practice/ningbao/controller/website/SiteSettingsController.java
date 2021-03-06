package com.practice.ningbao.controller.website;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.website.SiteSettingsEntity;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.service.website.SiteSettingsService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 * 网站信息
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/site_settings")
public class SiteSettingsController {

    @Autowired
    UserService userService;

    @Autowired
    SiteSettingsService siteSettingsService;

    @ApiOperation("查询系统设置")
    @GetMapping("/get")
    public ResultEntity getSiteSettings() {
        try {

            return ResultUtil.success(siteSettingsService.getById(0));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改系统设置")
    @PostMapping("/modify")
    public ResultEntity modifySiteSettings(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                          @ApiParam("图片") @RequestBody SiteSettingsEntity siteSettingsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            System.out.println(siteSettingsEntity);

            siteSettingsEntity.setId(0);
            siteSettingsService.updateById(siteSettingsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

