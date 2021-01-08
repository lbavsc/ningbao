package com.practice.ningbao.entity.website;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="SiteSettings对象", description="")
public class SiteSettingsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;

    @ApiModelProperty(value = "网站名称")
    @TableField("site_name")
    private String siteName;

    @ApiModelProperty(value = "网站logo")
    @TableField("site_logo")
    private String siteLogo;

    @ApiModelProperty(value = "网站slogan")
    @TableField("site_slogan")
    private String siteSlogan;

    @ApiModelProperty(value = "400客服号码")
    @TableField("customer_service")
    private String customerService;

    @ApiModelProperty(value = "网站备案信息")
    @TableField("record_information")
    private String recordInformation;

    @ApiModelProperty(value = "工作时间")
    @TableField("operating_hours")
    private String operatingHours;

    @ApiModelProperty(value = "公众号二维码")
    @TableField("official_accounts")
    private String officialAccounts;

    @ApiModelProperty(value = "客服微信二维码")
    @TableField("wechar_customer_service")
    private String wecharCustomerService;

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
