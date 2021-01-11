package com.practice.ningbao.controller.contact;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.contact.ConntactUsEntity;
import com.practice.ningbao.service.contact.ConntactUsService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.sql.ResultSet;

/**
 * <p>
 * 前端控制器
 * </p>
 * 联系我们
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/conntact_us")
public class ConntactUsController {
    @Autowired
    UserService userService;

    @Autowired
    ConntactUsService conntactUsService;

    @GetMapping("/get")
    @ApiOperation("联系我们信息")
    public ResultEntity getInfo() {
        try {
            ConntactUsEntity conntactUsEntity = conntactUsService.getById(0);
            return ResultUtil.success(conntactUsEntity);
        } catch (Exception e) {
            return ResultUtil.error("1003", "系统发生错误,请联系管理员");
        }
    }

    @PostMapping("/modify")
    @ApiOperation("修改联系我们信息")
    public ResultEntity modifyInfo(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                   @ApiParam("联系我们bean") @RequestBody ConntactUsEntity conntactUsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            conntactUsEntity.setId(0);
            conntactUsService.updateById(conntactUsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

