package com.practice.ningbao.entity.website;

import com.baomidou.mybatisplus.annotation.*;

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
@ApiModel(value="CarouselPic对象", description="")
@TableName("carousel_pic")
public class CarouselPicEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片ID")
    @TableId(value = "pic_id", type = IdType.AUTO)
    private Integer picId;

    @ApiModelProperty(value = "轮播图链接")
    @TableField("pic_link")
    private String picLink;


}
