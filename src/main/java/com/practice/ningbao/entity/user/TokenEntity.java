package com.practice.ningbao.entity.user;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Token对象", description = "")
@TableName("token")
public class TokenEntity implements Serializable {


    private static final long serialVersionUID = 2734703807289200522L;
    @ApiModelProperty(value = "用户ID")
    @TableId(value = "user_id", type = IdType.ID_WORKER)
    private Integer userId;

    @ApiModelProperty(value = "用户token")
    @TableField("token")
    private String token;

    @ApiModelProperty(value = "过期时间")
    @TableField("expire_time")
    private Date expireTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;


}
