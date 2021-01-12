package com.practice.ningbao.controller.website;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.website.PartnerEntity;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.service.website.PartnerService;
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
 *
 * @author lbavsc
 * @since 2021-01-12
 */
@RestController
@RequestMapping("/partner")
public class PartnerController {
    @Autowired
    UserService userService;

    @Autowired
    PartnerService partnerService;

    @ApiOperation("获得合作伙伴列表")
    @GetMapping("/list")
    public ResultEntity listPartner() {
        try {
            return ResultUtil.success(partnerService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }



    @ApiOperation("新增合作伙伴")
    @PostMapping("/add")
    public ResultEntity addPartner(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                   @ApiParam("图片") MultipartFile img,
                                   @ApiParam("合作伙伴名称") @RequestParam(required = false, defaultValue = "notPartnerName") String partnerName) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            if (img.isEmpty()) {
                return ResultUtil.error("1003", "您未上传图片");
            }
            if ("notPartnerName".equals(partnerName)) {
                return ResultUtil.error("1003", "您未填写合作伙伴名称");
            }

            partnerService.savePartner(img, partnerName);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    @ApiOperation("删除合作伙伴")
    @PostMapping("/delete")
    public ResultEntity deletePartner(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                      @ApiParam("合作伙伴名称") @RequestBody PartnerEntity partnerEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            partnerService.removeById(partnerEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }



    //// FIXME: 2021/1/12 MultipartFile如果为空, equired = false无效

    @ApiOperation("新增合作伙伴")
    @PostMapping("/modify")
    public ResultEntity modifyPartner(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                      @ApiParam("图片") MultipartFile img,
                                      @ApiParam("合作伙伴名称") @RequestParam(required = false, defaultValue = "notPartnerName") String partnerName,
                                      @ApiParam("合作伙伴名称") @RequestParam(required = false, defaultValue = "notPartnerName") Integer id) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            partnerService.updatePartner(img, partnerName, id);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

