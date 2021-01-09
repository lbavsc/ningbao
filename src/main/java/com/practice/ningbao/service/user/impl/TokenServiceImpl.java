package com.practice.ningbao.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.practice.ningbao.entity.user.TokenEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.mapper.user.TokenMapper;
import com.practice.ningbao.service.user.TokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, TokenEntity> implements TokenService {

    /**
     * 12小时后过期
     */
    private final static int EXPIRE = 3600 * 12;

    @Override
    public TokenEntity queryByToken(String token) {
        return this.getOne(new QueryWrapper<TokenEntity>().eq("token", token));
    }

    @Override
    public TokenEntity createToken(UserEntity user) {
        //当前时间
        Date now = new Date();
        //过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
        //生成token
        String token = generateToken();

        //保存或更新用户token
        TokenEntity tokenEntity = new TokenEntity();
        tokenEntity.setUserId(user.getId());
        tokenEntity.setToken(token);
        tokenEntity.setUpdateTime(now);
        tokenEntity.setExpireTime(expireTime);
        this.saveOrUpdate(tokenEntity);

        return tokenEntity;
    }

    @Override
    public void expireToken(String userId) {
        baseMapper.deleteById(userId);
    }

    private String generateToken() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
