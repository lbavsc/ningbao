package com.practice.ningbao.service.website;

import com.practice.ningbao.entity.website.CarouselPicEntity;
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
public interface CarouselPicService extends IService<CarouselPicEntity> {
    void saveOrUpdateCarouselPic(MultipartFile img, Integer id);
}
