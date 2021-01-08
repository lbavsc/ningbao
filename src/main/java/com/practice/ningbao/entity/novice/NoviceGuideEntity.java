package com.practice.ningbao.entity.novice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="NoviceGuide对象", description="")
public class NoviceGuideEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "新手指引ID")
    @TableId(value = "novice_guide_id", type = IdType.ID_WORKER)
    private Integer noviceGuideId;

    @ApiModelProperty(value = "新手指引流程图")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "新手指引内容")
    @TableField("content")
    private String content;


}
