package com.practice.ningbao.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.user.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.vo.LoginFormVo;
import com.practice.ningbao.vo.UserInfoVo;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface UserService extends IService<UserEntity> {

    /**
     * 验证验证码
     * @param
     * @param session
     * @return
     */
    public boolean isCheckCaptcha(LoginFormVo form, HttpSession session);

    public int queryUserType(LoginFormVo form);

    public boolean isAdmin(String token);

    public UserInfoVo info(Integer id);

    public String userVerification(LoginFormVo form);

    public boolean banUser(UserEntity userEntity,  String token);

    public boolean deleteUser(UserEntity userEntity,  String token);

    public IPage<UserEntity> selectUserPage(Page<UserEntity> page, Integer state);
}
