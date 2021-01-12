package com.practice.ningbao.controller.website;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.service.website.CarouselPicService;
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
 * 轮播图片
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/carousel_pic")
public class CarouselPicController {
    @Autowired
    UserService userService;
    @Autowired
    CarouselPicService carouselPicService;


    @ApiOperation("获得轮播图")
    @GetMapping("/get")
    public ResultEntity getCarouselPic() {
        try {
            return ResultUtil.success(carouselPicService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    //// TODO: 2021/1/11 修改轮播图
    @ApiOperation("修改轮播图")
    @PostMapping("/modify")
    public ResultEntity modifyCarouselPic(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                          @ApiParam("图片") @RequestParam(value = "img", required = false) MultipartFile img,
                                          @ApiParam("图片ID") @RequestParam(required = false) Integer id) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            if (id == null){
                return ResultUtil.error("1003", "您未选择需要修改的图片");
            }

            carouselPicService.saveOrUpdateCarouselPic(img, id);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

}

