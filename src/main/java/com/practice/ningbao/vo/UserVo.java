package com.practice.ningbao.vo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Data
public class UserVo implements Serializable {


    private static final long serialVersionUID = 9126591359446462762L;
    private Integer id;

    private String name;

    private String password;

    private Integer userType;

    private Integer userStatus;

    private Long pages;

}
