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
@ApiModel(value="CarouselNews对象", description="")
@TableName("carousel_news")
public class CarouselNewsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "轮播新闻ID")
    @TableId(value = "news_id", type = IdType.ID_WORKER)
    private Integer newsId;

    @ApiModelProperty(value = "轮播新闻链接")
    @TableField("news_link")
    private String newsLink;


}
