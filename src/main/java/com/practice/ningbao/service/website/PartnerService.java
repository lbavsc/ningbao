package com.practice.ningbao.service.website;

import com.practice.ningbao.entity.website.PartnerEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-12
 */
public interface PartnerService extends IService<PartnerEntity> {
    void savePartner(MultipartFile img, String partnerName);

    void updatePartner(MultipartFile img, String partnerName,Integer id);
}
