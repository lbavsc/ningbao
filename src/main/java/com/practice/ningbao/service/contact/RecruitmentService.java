package com.practice.ningbao.service.contact;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.ningbao.vo.MyPageVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface RecruitmentService extends IService<RecruitmentEntity> {
    public IPage<RecruitmentEntity> selectRecruitmentPage(MyPageVo<RecruitmentEntity> page);

    public void deleteRecruitment(Integer id);
}
