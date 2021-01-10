package com.practice.ningbao.service.user;

import com.practice.ningbao.entity.user.TokenEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.entity.user.UserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface TokenService extends IService<TokenEntity> {
    TokenEntity queryByToken(String token);

    /**
     * 生成token
     * @param user  用户ID
     * @return        返回token信息
     */
    TokenEntity createToken(UserEntity user);

    /**
     * 设置token过期
     * @param userId 用户ID
     */
    void expireToken(String userId);

    void isExprie(String userId);
}
