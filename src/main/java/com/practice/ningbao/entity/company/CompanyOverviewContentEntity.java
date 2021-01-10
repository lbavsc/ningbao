package com.practice.ningbao.entity.company;

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
@ApiModel(value="CompanyOverviewContent对象", description="")
@TableName("company_overview_content")
public class CompanyOverviewContentEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "公司概况内容ID")
    @TableId(value = "content_id", type = IdType.AUTO)
    private Integer contentId;

    @ApiModelProperty(value = "内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "所属目录ID")
    @TableField("owned_directory")
    private Integer ownedDirectory;

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
