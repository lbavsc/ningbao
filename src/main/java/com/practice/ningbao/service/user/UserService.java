package com.practice.ningbao.service.user;

import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.util.ResultCodeEnum;
import com.practice.ningbao.util.form.LoginForm;
import com.practice.ningbao.vo.UserInfo;

import javax.servlet.http.HttpSession;
import java.util.Map;

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
    public boolean isCheckCaptcha(LoginForm form, HttpSession session);

    public int queryUserType(LoginForm form);

    public boolean isAdmin(String token);

    public UserInfo info(LoginForm form);

    public String userVerification(LoginForm form);

    public boolean banUser(UserEntity userEntity,  String token);

    public boolean deleteUser(UserEntity userEntity,  String token);
}
