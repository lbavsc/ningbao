package com.practice.ningbao.service.contact.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.practice.ningbao.entity.contact.RecruitmentEntity;
import com.practice.ningbao.mapper.contact.RecruitmentMapper;
import com.practice.ningbao.service.contact.RecruitmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.ningbao.vo.MyPageVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class RecruitmentServiceImpl extends ServiceImpl<RecruitmentMapper, RecruitmentEntity> implements RecruitmentService {

    @Override
    public IPage<RecruitmentEntity> selectRecruitmentPage(MyPageVo<RecruitmentEntity> page) {
        return baseMapper.selectRecruitmentPageVo(page);
    }

    @Override
    public void deleteRecruitment(Integer id) {
        baseMapper.deleteById(id);
    }
}
