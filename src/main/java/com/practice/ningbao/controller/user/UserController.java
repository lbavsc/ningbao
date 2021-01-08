package com.practice.ningbao.controller.user;


import com.practice.ningbao.entity.user.User;
import com.practice.ningbao.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * 用户信息
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/ningbao/user")
public class UserController {

    @GetMapping("/login")
    public User login(){
        User user = new User();
        user.setId(32);
        user.setName("wef");
        return user;
    }

}

