package com.practice.ningbao.entity.news;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="NewsLeaderboard对象", description="")
@TableName("news_leaderboard")
public class NewsLeaderboardEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "新闻ID")
    @TableId(value = "news_id", type = IdType.ID_WORKER)
    private Integer newsId;


}
