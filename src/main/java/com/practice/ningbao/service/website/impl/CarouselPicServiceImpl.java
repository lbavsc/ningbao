package com.practice.ningbao.service.website.impl;

import com.practice.ningbao.entity.novice.NoviceGuideEntity;
import com.practice.ningbao.entity.website.CarouselPicEntity;
import com.practice.ningbao.mapper.website.CarouselPicMapper;
import com.practice.ningbao.service.website.CarouselPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Objects;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lbavsc
 * @since 2021-01-08
 */
@Service
public class CarouselPicServiceImpl extends ServiceImpl<CarouselPicMapper, CarouselPicEntity> implements CarouselPicService {

    @Override
    public void saveOrUpdateCarouselPic(MultipartFile img, Integer id) {

        if (id == null) {
            return;
        }
        //获取项目classes/static的地址
        String staticPath = Objects.requireNonNull(Objects.requireNonNull(ClassUtils.getDefaultClassLoader()).getResource("static")).getPath();
        //获取文件名
        String fileName = img.getOriginalFilename();
        assert fileName != null;
        fileName = "carousel_pic" + id + fileName.substring(fileName.lastIndexOf("."));

        // 图片存储目录及图片名称
//        String urlPath = "images/guide" + File.separator + fileName;
        String urlPath = "images/carousel/" + fileName;
        //图片保存路径
        String savePath = staticPath + File.separator + urlPath;

        File saveFile = new File(savePath);
        if (!saveFile.exists()) {
            saveFile.mkdirs();
        }
        //获取本机IP
        String host = null;
        try {
            host = InetAddress.getLocalHost().getHostAddress();
            //将临时存储的文件移动到真实存储路径下
            img.transferTo(saveFile);
            CarouselPicEntity carouselPicEntity = new CarouselPicEntity();
            if (!img.isEmpty()) {
                carouselPicEntity.setPicLink("http://" + host + ":8080/" + urlPath);
            }
            carouselPicEntity.setPicId(id);

            this.updateById(carouselPicEntity);

        } catch (IOException e) {
            System.err.println("CarouselPicServiceImpl:  saveOrUpdateCarouselPic:" + e);
        }
    }
}
