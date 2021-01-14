package com.practice.ningbao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.mapper.contact.RecruitmentMapper;
import com.practice.ningbao.service.contact.RecruitmentService;
import com.practice.ningbao.service.user.TokenService;
import com.practice.ningbao.service.user.UserService;
import com.practice.ningbao.vo.LoginFormVo;
import com.practice.ningbao.vo.MyPageVo;
import com.practice.ningbao.vo.UserVo;
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

    @Autowired
    RecruitmentMapper recruitmentMapper;

    @Autowired
    RecruitmentService recruitmentService;
//    @Test
//    void contextLoads() throws SQLException {
//        LoginFormVo userInfo = new LoginFormVo();
//        userInfo.setId("10151");
//
//        userService.userVerification(userInfo);
//
//    }

    @Test
    void addUser()throws SQLException {
        MyPageVo<RecruitmentEntity> myPage = new MyPageVo<>(1, 10);
        IPage<RecruitmentEntity> recruitmentEntityIpage = recruitmentService.selectRecruitmentPage(myPage);
        System.out.println(recruitmentEntityIpage.getRecords());

    }

    @Test
    void listUser()throws SQLException {
//        MyPageVo<UserVo> page = new MyPageVo<>(1,120);
//        final IPage<UserVo> userEntityIPage = userService.selectUserPage(page, null);
//        System.out.println(userEntityIPage.getPages());
//        System.out.println(userEntityIPage.getTotal());
//        List<UserVo> userEntities = userEntityIPage.getRecords();
//        userEntities.forEach(System.out::println);

    }

}
