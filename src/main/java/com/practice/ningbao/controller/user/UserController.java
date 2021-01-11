package com.practice.ningbao.controller.user;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.user.TokenEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.service.user.TokenService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.constant.LoginConstant;
import com.practice.ningbao.util.ResultUtil;
import com.practice.ningbao.util.ValidateCodeUtil;
import com.practice.ningbao.util.constant.UserConstant;
import com.practice.ningbao.vo.LoginForm;
import com.practice.ningbao.vo.MyPage;
import com.practice.ningbao.vo.UserInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 * 用户信息
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    /**
     * 企业用户登录接口
     *
     * @param
     * @return
     */
    @ApiOperation("企业用户登录")
    @PostMapping("/enterprise/login")
    public ResultEntity enterpriseLogin(@RequestBody @Validated LoginForm loginForm, HttpSession session) {
        String accountStatus = userService.userVerification(loginForm);
        try {
            if (!userService.isCheckCaptcha(loginForm, session)) {
                return ResultUtil.error("1002", "验证码不正确");
            }
            if (LoginConstant.USER_NOT_EXIST.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号不存在");
            }
            if (UserConstant.ENTERPRISE_USER_TYPT != userService.queryUserType(loginForm)) {
                return ResultUtil.error("1003", "您不是企业用户");
            }

            if (LoginConstant.PASSWD_INCORRECT.equals(accountStatus)) {
                return ResultUtil.error("1002", "密码错误");
            }
            if (LoginConstant.USER_BAN.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号被封禁中");
            }
            UserInfo userInfo = userService.info(Integer.valueOf(loginForm.getId()));
            return ResultUtil.success(userInfo);
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    /**
     * 供应商用户登录接口
     *
     * @param
     * @return
     */
    @ApiOperation("供应商用户登录")
    @PostMapping("/supplier/login")
    public ResultEntity supplierLogin(@RequestBody @Validated LoginForm loginForm, HttpSession session) {
        String accountStatus = userService.userVerification(loginForm);
        try {
            if (!userService.isCheckCaptcha(loginForm, session)) {
                return ResultUtil.error("1002", "验证码不正确");
            }
            if (LoginConstant.USER_NOT_EXIST.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号不存在");
            }
            if (UserConstant.SUPPLIER_USER_TYPT != userService.queryUserType(loginForm)) {
                return ResultUtil.error("1003", "您不是供应商用户");
            }

            if (LoginConstant.PASSWD_INCORRECT.equals(accountStatus)) {
                return ResultUtil.error("1002", "密码错误");
            }
            if (LoginConstant.USER_BAN.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号被封禁中");
            }
            UserInfo userInfo = userService.info(Integer.valueOf(loginForm.getId()));
            return ResultUtil.success(userInfo);
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    /**
     * 管理员登录接口
     *
     * @param
     * @return
     */
    @ApiOperation("管理员登录")
    @PostMapping("/admin/login")
    public ResultEntity adminLogin(@RequestBody @Validated LoginForm loginForm, HttpSession session) {
        String accountStatus = userService.userVerification(loginForm);
        try {
            if (!userService.isCheckCaptcha(loginForm, session)) {
                return ResultUtil.error("1002", "验证码不正确");
            }
            if (LoginConstant.USER_NOT_EXIST.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号不存在");
            }
            if (UserConstant.ADMIN_USER_TYPT != userService.queryUserType(loginForm)) {
                return ResultUtil.error("1003", "您不是管理员用户");
            }

            if (LoginConstant.PASSWD_INCORRECT.equals(accountStatus)) {
                return ResultUtil.error("1002", "密码错误");
            }
            if (LoginConstant.USER_BAN.equals(accountStatus)) {
                return ResultUtil.error("1001", "帐号被封禁中");
            }
            UserInfo userInfo = userService.info(Integer.valueOf(loginForm.getId()));
            return ResultUtil.success(userInfo);
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    @ApiOperation("获得用户个人信息")
    @GetMapping("/info")
    public ResultEntity info(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token) {
        try {
            System.out.println(token);
            TokenEntity tokenEntity = tokenService.queryByToken(token);
            if (tokenEntity == null) {
                return ResultUtil.error("1003", "登录状态发生变化,请重新登录");
            }
            int userId = tokenEntity.getUserId();
            UserInfo userInfo = userService.info(userId);
            return ResultUtil.success(userInfo);
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    /**
     * 用户登出接口
     *
     * @param
     * @return
     */
    @ApiOperation("用户登出")
    @GetMapping("/logout")
    public ResultEntity logout(@RequestHeader String token) {
        try {
            TokenEntity tokenEntity = tokenService.queryByToken(token);
            if (tokenEntity == null) {
                return ResultUtil.error("1002", "您当前未登录");
            }
            String id = String.valueOf(tokenEntity.getUserId());
            tokenService.expireToken(id);
            return ResultUtil.success();
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("新增用户")
    @PostMapping("/admin/add_user")
    public ResultEntity userAdd(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                @ApiParam("新增用户名") @RequestBody UserEntity userEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1001", "您不是管理员");
            }
            userEntity.setPassword(DigestUtils.md5DigestAsHex(userEntity.getPassword().getBytes()));
            userService.save(userEntity);

            return ResultUtil.success("用户" + userEntity.getName() + "添加成功");
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("封禁用户")
    @PostMapping("/admin/ban_user")
    public ResultEntity userBan(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                @ApiParam("封禁用户名") @RequestBody UserEntity userEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1001", "您不是管理员");
            }
            if (!userService.banUser(userEntity, token)) {
                return ResultUtil.error("1001", "不能封禁自己");
            }
            return ResultUtil.success("封禁" + userEntity.getName() + "用户成功");
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    /**
     * 删除用户
     *
     * @param token
     * @param userEntity
     * @return
     */
    @ApiOperation("删除用户")
    @PostMapping("/admin/delete_user")
    public ResultEntity userDelete(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                   @ApiParam("封禁用户名") @RequestBody UserEntity userEntity) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1001", "您不是管理员");
            }
            if (!userService.deleteUser(userEntity, token)) {
                return ResultUtil.error("1001", "不能删除自己");
            }
            return ResultUtil.success("删除" + userEntity.getName() + "用户成功");
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("修改用户信息")
    @PostMapping("/admin/reset_user")
    public ResultEntity userReset(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                  @ApiParam("封禁用户名") @RequestBody UserEntity userEntity) {

        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1001", "您不是管理员");

            }
            userService.getBaseMapper().selectById(userEntity.getId());
            if (!userEntity.getPassword().isEmpty()) {
                userEntity.setPassword(DigestUtils.md5DigestAsHex(userEntity.getPassword().getBytes()));
            }
//            userService.saveOrUpdate(userEntity);
            userService.getBaseMapper().updateById(userEntity);

            return ResultUtil.success("修改" + userEntity.getName() + "用户信息成功");
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    @ApiOperation("用户列表")
    @GetMapping("/admin/list_user")
    public ResultEntity ListUser(@ApiParam("当前操作用户token") @RequestHeader(required = false) @NotNull(message = "token不能为空") String token,
                                 @ApiParam("查询的页数") @RequestParam(required = false) Integer current,
                                 @ApiParam("一页的数量") @RequestParam(required = false) Integer size,
                                 @ApiParam("用户类型") @RequestParam(required = false) Integer state) {
        try {
            if (!userService.isAdmin(token)) {
                return ResultUtil.error("1001", "您不是管理员");
            }
            if (current == null) {
                current = 1;
            }
            if (size == null) {
                size = 10;
            }
            MyPage<UserEntity> myPage = new MyPage<>(current, size);
            IPage<UserEntity> userEntityIpage = userService.selectUserPage(myPage, state);
            if (userEntityIpage.getTotal() == 0) {
                return ResultUtil.error("1004", "没有相关的数据");
            }
            return ResultUtil.success(userEntityIpage.getRecords());
        } catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }

    }

    /**
     * 获取验证码接口
     *
     * @param request
     * @param response
     */
    @GetMapping("verification_code")
    public void getVerficationCode(HttpServletRequest request, HttpServletResponse response) {
        try {
            // 设置发送到客户端的响应的内容类型
            response.setContentType("image/png");
            // 没有缓存
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Expire", "0");
            response.setHeader("Pragma", "no-cache");
            ValidateCodeUtil validateCode = new ValidateCodeUtil();
            validateCode.getRandomCodeImage(request, response, ValidateCodeUtil.IMG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

