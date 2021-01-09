package com.practice.ningbao;

import com.practice.ningbao.entity.user.TokenEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.mapper.user.TokenMapper;
import com.practice.ningbao.service.user.TokenService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.util.form.LoginForm;
import com.practice.ningbao.vo.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class NingbaoApplicationTests {

    @Autowired
    TokenService tokenService;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() throws SQLException {
        LoginForm userInfo = new LoginForm();
        userInfo.setId(10151);

        userService.userVerification(userInfo);

    }

}
