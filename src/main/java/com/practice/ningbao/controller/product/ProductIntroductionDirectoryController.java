package com.practice.ningbao.controller.product;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.company.CompanyOverviewDirectoryEntity;
import com.practice.ningbao.entity.product.ProductIntroductionDirectoryEntity;
import com.practice.ningbao.service.company.CompanyOverviewDirectoryService;
import com.practice.ningbao.service.product.ProductIntroductionDirectoryService;
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
 * 产品介绍目录
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/product_introduction_directory")
public class ProductIntroductionDirectoryController {
    @Autowired
    UserService userService;
    @Autowired
    ProductIntroductionDirectoryService companyOverviewDirectoryService;

    @ApiOperation("公司概况2级目录")
    @GetMapping("/get")
    public ResultEntity getDir() {
        try {
            return ResultUtil.success(companyOverviewDirectoryService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    @ApiOperation("增加公司2级目录")
    @GetMapping("/add")
    public ResultEntity addDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                               @ApiParam("目录名") @RequestBody ProductIntroductionDirectoryEntity productIntroductionDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            companyOverviewDirectoryService.save(productIntroductionDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    //// TODO: 2021/1/11 删除目录
    @ApiOperation("删除公司2级目录")
    @GetMapping("/delete")
    public ResultEntity deleteDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                  @ApiParam("目录名") @RequestBody ProductIntroductionDirectoryEntity productIntroductionDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            companyOverviewDirectoryService.removeById(productIntroductionDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改公司2级目录")
    @GetMapping("/modify")
    public ResultEntity modifyDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                  @ApiParam("目录名") @RequestBody ProductIntroductionDirectoryEntity productIntroductionDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            companyOverviewDirectoryService.updateById(productIntroductionDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

}

