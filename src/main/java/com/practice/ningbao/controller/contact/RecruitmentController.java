package com.practice.ningbao.controller.contact;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.practice.ningbao.service.contact.RecruitmentService;
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
 * 招聘公告
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/recruitment")
public class RecruitmentController {

    @Autowired
    UserService userService;
    @Autowired
    RecruitmentService recruitmentService;


    //// FIXME: 2021/1/14 分页获取有sql语句错误,暂时返回全部信息
    @ApiOperation("获得招聘公告列表")
    @GetMapping("/get_list")
    public ResultEntity ListInfo(@ApiParam("查询的页数") @RequestParam(required = false) Integer current) {
        try {
//            if (current == null) {
//                current = 1;
//            }
//            MyPageVo<RecruitmentEntity> myPage = new MyPageVo<>(current, 10);
//            IPage<RecruitmentEntity> recruitmentEntityIpage = recruitmentService.selectRecruitmentPage(myPage);
//            if (recruitmentEntityIpage.getTotal() == 0) {
//                return ResultUtil.error("1004", "暂时没有招聘公告");
//            }
//            return ResultUtil.success(recruitmentEntityIpage.getRecords());

            return ResultUtil.success(recruitmentService.list());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统出现错误,请联系管理员");
        }
    }


    @ApiOperation("获得招聘公告列表")
    @GetMapping("/get")
    public ResultEntity getInfo(@ApiParam("查询的页数") @RequestParam(required = false, defaultValue = "1") Integer recruitmentId) {
        try {


            return ResultUtil.success(recruitmentService.getById(recruitmentId));
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统出现错误,请联系管理员");
        }
    }

    @ApiOperation("新增招聘公告")
    @PostMapping("/add")
    public ResultEntity addRecruitment(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                       @ApiParam("联系我们bean") @RequestBody RecruitmentEntity recruitmentEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            recruitmentService.save(recruitmentEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("修改招聘公告")
    @PostMapping("/modify")
    public ResultEntity modifyRecruitment(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                          @ApiParam("联系我们bean") @RequestBody RecruitmentEntity recruitmentEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            recruitmentService.saveOrUpdate(recruitmentEntity);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

//    @ApiOperation("修改招聘公告")
//    @PostMapping("/add")
//    public ResultEntity modifyRecruitment(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
//                                          @ApiParam("联系我们bean") @RequestParam String title,
//                                          @ApiParam("联系我们bean") @RequestParam String content) {
//        try {
//            if (!userService.isAdmin(token)) {
//                return ResultUtil.error("1002", "您不是管理员");
//            }
//            RecruitmentEntity recruitmentEntity = new RecruitmentEntity();
//            recruitmentEntity.setTitle(title);
//            recruitmentEntity.setContent(content);
//            recruitmentService.saveOrUpdate(recruitmentEntity);
//            return ResultUtil.success();
//        } catch (Exception e) {
//            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
//        }
//    }

    @ApiOperation("删除招聘公告")
    @PostMapping("/delete")
    public ResultEntity deleteRecruitment(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                          @ApiParam("联系我们bean") @RequestBody RecruitmentEntity recruitmentEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1002", "您不是管理员");
            }
            recruitmentService.deleteRecruitment(recruitmentEntity.getRecruitmentId());
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }
}

