package com.practice.ningbao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.service.user.TokenService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.vo.LoginForm;
import com.practice.ningbao.vo.MyPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.sql.SQLException;
import java.util.List;

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

    @Test
    void addUser()throws SQLException {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("1");
        userEntity.setPassword(DigestUtils.md5DigestAsHex("asdf123456".getBytes()));
        userEntity.setUserType(1);
        for (int i = 0; i < 100; i++) {
            userService.save(userEntity);
        }

    }

    @Test
    void listUser()throws SQLException {
        MyPage<UserEntity>page = new MyPage<>(1,120);
        final IPage<UserEntity> userEntityIPage = userService.selectUserPage(page, null);
        System.out.println(userEntityIPage.getPages());
        System.out.println(userEntityIPage.getTotal());
        List<UserEntity> userEntities = userEntityIPage.getRecords();
        userEntities.forEach(System.out::println);

    }

}
