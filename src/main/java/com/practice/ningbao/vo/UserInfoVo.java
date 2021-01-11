package com.practice.ningbao.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoVo implements Serializable {

    private static final long serialVersionUID = 2955008400270246003L;
    int id;
    String name;
    String token;

}
