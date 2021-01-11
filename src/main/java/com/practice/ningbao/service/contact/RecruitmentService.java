package com.practice.ningbao.service.contact;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.entity.user.UserEntity;
import com.practice.ningbao.vo.MyPage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface RecruitmentService extends IService<RecruitmentEntity> {
    public IPage<RecruitmentEntity> selectRecruitmentPage(MyPage<RecruitmentEntity> page);

    public void deleteRecruitment(Integer id);
}
