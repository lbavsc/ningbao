package com.practice.ningbao.controller.news;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.company.CompanyOverviewDirectoryEntity;
import com.practice.ningbao.entity.news.NewsEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.service.news.NewsService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.ResultUtil;
import com.practice.ningbao.vo.MyPageVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 * 新闻模块
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    UserService userService;

    @Autowired
    NewsService newsService;

    //// TODO: 2021/1/11 查询新闻列表
    @ApiOperation("查询新闻列表")
    @GetMapping("/list")
    public ResultEntity ListNews(@ApiParam("查询的页数") @RequestParam(required = false) Integer current,
                                 @ApiParam("一页的数量") @RequestParam(required = false) Integer size,
                                 @ApiParam("用户类型") @RequestParam(required = false) Integer newsType) {
        try {
            if (current == null) {
                current = 1;
            }
            if (size == null) {
                size = 10;
            }
            MyPageVo<NewsEntity> myPage = new MyPageVo<>(current, size);
            IPage<NewsEntity> newsEntityIpage = newsService.selectNewsPage(myPage, newsType);
            if (newsEntityIpage.getTotal() == 0) {
                return ResultUtil.error("1004", "没有相关的数据");
            }
            return ResultUtil.success(newsEntityIpage.getRecords());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("查询单条新闻")
    @GetMapping("/get")
    public ResultEntity getNews(@ApiParam("查询的页数") @RequestParam(required = false) Integer newsId) {
        try {

            return ResultUtil.success(newsService.getById(newsId));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    @ApiOperation("新增或修改新闻")
    @PostMapping("/add_or_modify")
    public ResultEntity addNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                @ApiParam("目录名") @RequestBody NewsEntity newsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsService.saveOrUpdate(newsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }


    //// TODO: 2021/1/11 删除新闻
    @ApiOperation("删除新闻")
    @PostMapping("/delete")
    public ResultEntity deteleNews(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                   @ApiParam("目录名") @RequestBody NewsEntity newsEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            newsService.removeById(newsEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

}

