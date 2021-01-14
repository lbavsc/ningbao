package com.practice.ningbao.vo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Data
public class NewsVo implements Serializable {

    private static final long serialVersionUID=1L;


    private Integer newsId;


    private String newsSource;


    private String title;


    private String content;

    private Integer newsType;

    private Long pages;

}
