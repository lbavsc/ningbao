package com.practice.ningbao.mapper.contact;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.vo.MyPage;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Mapper
public interface RecruitmentMapper extends BaseMapper<RecruitmentEntity> {
    IPage<RecruitmentEntity> selectRecruitmentPageVo(MyPage<?> page);
}
