package com.practice.ningbao.controller.novice;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.novice.NoviceGuideEntity;
import com.practice.ningbao.service.novice.NoviceGuideService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * <p>
 * 前端控制器
 * </p>
 * 新手指引
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/novice_guide")
public class NoviceGuideController {
    @Autowired
    UserService userService;

    @Autowired
    NoviceGuideService noviceGuideService;


    @ApiOperation("获得新手指引")
    @GetMapping("/get")
    public ResultEntity getNoviceGuide() {
        try {
            return ResultUtil.success(noviceGuideService.getById(0));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }


    @ApiOperation("修改新手指引")
    @PostMapping("/modify")
    public ResultEntity modifyNoviceGuide(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                          @ApiParam("图片") @RequestParam(value = "img", required = false) MultipartFile img,
                                          @ApiParam("内容") @RequestParam(required = false) String content) {
            try {
                if (!userService.isAdmin(token)) {
                    return ResultUtil.error("1002", "您不是管理员");
                }
                noviceGuideService.saveOrUpdateNoviceGuide(img, content);
                return ResultUtil.success();
            } catch (Exception e) {
                return ResultUtil.error("1002", "系统发生错误,请联系管理员");
            }
    }
}

