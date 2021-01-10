package com.practice.ningbao.entity.contact;

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
@ApiModel(value="ConntactUs对象", description="")
@TableName("conntact_us")
public class ConntactUsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;

    @ApiModelProperty(value = "地址")
    @TableField("addr")
    private String addr;

    @ApiModelProperty(value = "手机号码")
    @TableField("cell_phone")
    private String cellPhone;

    @ApiModelProperty(value = "电话号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "邮编")
    @TableField("postcode")
    private String postcode;

    @ApiModelProperty(value = "传真")
    @TableField("fax")
    private String fax;

    @ApiModelProperty(value = "邮箱")
    @TableField("mailbox")
    private String mailbox;

    @ApiModelProperty(value = "微信")
    @TableField("wechat")
    private String wechat;

    @ApiModelProperty(value = "微博")
    @TableField("weibo")
    private String weibo;

    @ApiModelProperty(value = "乐观锁")
    @TableField("version")
    @Version
    private Integer version;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("is_delete")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "gmt_update", fill = FieldFill.INSERT_UPDATE)
    private Date gmtUpdate;


}
