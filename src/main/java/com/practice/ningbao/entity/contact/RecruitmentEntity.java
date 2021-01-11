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
@ApiModel(value="Recruitment对象", description="")
@TableName("recruitment")
public class RecruitmentEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "招聘公告ID")
    @TableId(value = "recruitment_id", type = IdType.AUTO)
    private Integer recruitmentId;

    @ApiModelProperty(value = "招聘公告内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "招聘公告标题")
    @TableField("title")
    private String title;

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
