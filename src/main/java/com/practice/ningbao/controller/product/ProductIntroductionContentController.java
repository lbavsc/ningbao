package com.practice.ningbao.controller.product;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.company.CompanyOverviewContentEntity;
import com.practice.ningbao.entity.product.ProductIntroductionContentEntity;
import com.practice.ningbao.service.product.ProductIntroductionContentService;
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
 * 产品内容
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/product_introduction_content")
public class ProductIntroductionContentController {

    @Autowired
    UserService userService;

    @Autowired
    ProductIntroductionContentService productIntroductionContentService;


    //// TODO: 2021/1/11 获取对应目录内容
    @ApiOperation("获取产品介绍对应目录内容")
    @GetMapping("/get")
    public ResultEntity getContent(@ApiParam("目录ID") @RequestParam(required = false, defaultValue = "0") Integer dirId) {
        try {
            return ResultUtil.success(productIntroductionContentService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    //// TODO: 2021/1/11 修改内容
    @ApiOperation("修改产品介绍对应目录内容")
    @PostMapping("/modify")
    public ResultEntity modifyContent(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                      @ApiParam("内容对象") @RequestBody ProductIntroductionContentEntity productIntroductionContentEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            productIntroductionContentService.updateById(productIntroductionContentEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

}

