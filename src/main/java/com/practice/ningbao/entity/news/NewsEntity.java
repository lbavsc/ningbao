package com.practice.ningbao.entity.news;

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
@ApiModel(value="News对象", description="")
@TableName("news")
public class NewsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "新闻ID")
    @TableId(value = "news_id", type = IdType.AUTO)
    private Integer newsId;

    @ApiModelProperty(value = "新闻来源")
    @TableField("news_source")
    private String newsSource;

    @ApiModelProperty(value = "新闻标题")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "新闻原标题")
    @TableField("original_title")
    private String originalTitle;

    @ApiModelProperty(value = "新闻内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "新闻类型 0.公司新闻 1.集团新闻")
    @TableField("news_type")
    private Integer newsType;

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
