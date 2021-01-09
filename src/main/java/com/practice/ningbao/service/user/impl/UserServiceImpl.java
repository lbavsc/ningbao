package com.practice.ningbao.service.user.impl;

import com.practice.ningbao.entity.user.TokenEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.mapper.user.UserMapper;
import com.practice.ningbao.service.user.TokenService;
import com.practice.ningbao.service.user.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.ningbao.util.constant.LoginConstant;
import com.practice.ningbao.util.ResultCodeEnum;
import com.practice.ningbao.util.ValidateCodeUtil;
import com.practice.ningbao.util.form.LoginForm;
import com.practice.ningbao.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {


    @Autowired
    TokenService tokenService;

    @Override
    public boolean isCheckCaptcha(LoginForm form, HttpSession session) {
        String code = form.getVerificationCode();
        String sessionCode;
        sessionCode = String.valueOf(session.getAttribute(ValidateCodeUtil.SESSION_KEY)).toLowerCase();
        System.out.println("session里的验证码：" + sessionCode);
        String receivedCode = code.toLowerCase();
        System.out.println("用户的验证码：" + receivedCode);
        //验证码验证后进行失效处理
//        session.removeAttribute(ValidateCodeUtil.SESSION_KEY);
        return !"".equals(sessionCode) && !"".equals(receivedCode) && sessionCode.equals(receivedCode);
    }

    @Override
    public int queryUserType(LoginForm form) {
        UserEntity userEntity = baseMapper.selectById(form.getId());

        return userEntity.getUserType();
    }

    @Override
    public UserInfo info(LoginForm form) {
        int id = form.getId();
        UserEntity userEntity = baseMapper.selectById(id);
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userEntity.getId());
        userInfo.setName(userEntity.getName());
        userInfo.setToken(tokenService.getBaseMapper().selectById(id).getToken());
        return userInfo;
    }

    @Override
    public String userVerification(LoginForm form) {
        int id = form.getId();
        UserEntity userEntity = baseMapper.selectById(id);
        String password = DigestUtils.md5DigestAsHex(form.getPassword().getBytes());
        //帐号不存在
        if (userEntity == null) {
            return LoginConstant.USER_NOT_EXIST;
        }
        tokenService.createToken(userEntity);
        // 密码不正确
        if (!userEntity.getPassword().equals(password)) {
            return LoginConstant.PASSWD_INCORRECT;
        }
        // 账户被封禁
        if (userEntity.getUserStatus() != 0) {
            return LoginConstant.USER_BAN;
        }
        // 通过
        return LoginConstant.USER_PASS;

    }

    @Override
    public boolean banUser(UserEntity userEntity, String token) {
        int id = tokenService.queryByToken(token).getUserId();
        // 不能封禁自己
        if (id != userEntity.getId()) {
            userEntity.setUserStatus(1);
            this.saveOrUpdate(userEntity);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(UserEntity userEntity, String token) {
        int id = tokenService.queryByToken(token).getUserId();
        // 不能删除自己
        if (id != userEntity.getId()) {
            baseMapper.deleteById(userEntity.getId());
            return true;
        }
        return false;
    }


    @Override
    public boolean isAdmin(String token) {
        TokenEntity tokenEntity = tokenService.queryByToken(token);
        if (tokenEntity == null) {
            return false;
        }
        return baseMapper.selectById(tokenEntity.getUserId()).getUserType() == 0;
    }

}
