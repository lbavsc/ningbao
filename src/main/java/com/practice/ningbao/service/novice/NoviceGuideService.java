package com.practice.ningbao.service.novice;

import com.practice.ningbao.entity.novice.NoviceGuideEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
public interface NoviceGuideService extends IService<NoviceGuideEntity> {

    void saveOrUpdateNoviceGuide(MultipartFile img, String content);

}
