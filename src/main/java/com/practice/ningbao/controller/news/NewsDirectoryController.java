package com.practice.ningbao.controller.news;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.company.CompanyOverviewDirectoryEntity;
import com.practice.ningbao.entity.news.NewsDirectoryEntity;
import com.practice.ningbao.service.news.NewsDirectoryService;
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
 *
 * @author lbavsc
 * @since 2021-01-12
 */
@RestController
@RequestMapping("/news_directory")
public class NewsDirectoryController {
    @Autowired
    UserService userService;
    @Autowired
    NewsDirectoryService newsDirectoryService;

    @ApiOperation("新闻2级目录")
    @GetMapping("/get")
    public ResultEntity getDir() {
        try {
            return ResultUtil.success(newsDirectoryService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    @ApiOperation("增加新闻2级目录")
    @PostMapping("/add")
    public ResultEntity addDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                               @ApiParam("目录名") @RequestBody NewsDirectoryEntity newsDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsDirectoryService.save(newsDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    //// TODO: 2021/1/11 删除目录
    @ApiOperation("删除新闻2级目录")
    @PostMapping("/delete")
    public ResultEntity deleteDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                  @ApiParam("目录名") @RequestBody NewsDirectoryEntity newsDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsDirectoryService.removeById(newsDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改新闻2级目录")
    @PostMapping("/modify")
    public ResultEntity modifyDir(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                  @ApiParam("目录名") @RequestBody NewsDirectoryEntity newsDirectoryEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsDirectoryService.updateById(newsDirectoryEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

