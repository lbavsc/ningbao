package com.practice.ningbao.service.user.impl;

import com.practice.ningbao.entity.user.Token;
import com.practice.ningbao.mapper.user.TokenMapper;
import com.practice.ningbao.service.user.TokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, Token> implements TokenService {

}
