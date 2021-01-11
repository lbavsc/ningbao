package com.practice.ningbao.service.novice.impl;

import com.practice.ningbao.entity.novice.NoviceGuideEntity;
import com.practice.ningbao.mapper.novice.NoviceGuideMapper;
import com.practice.ningbao.service.novice.NoviceGuideService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practice.ningbao.util.ResultUtil;
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
public class NoviceGuideServiceImpl extends ServiceImpl<NoviceGuideMapper, NoviceGuideEntity> implements NoviceGuideService {

    @Override
    public void saveOrUpdateNoviceGuide(MultipartFile img, String content) {
        //获取项目classes/static的地址
        if (!img.isEmpty()) {
            System.out.println("img为空");
        }
        String staticPath = Objects.requireNonNull(Objects.requireNonNull(ClassUtils.getDefaultClassLoader()).getResource("static")).getPath();
        //获取文件名
        String fileName = img.getOriginalFilename();
        assert fileName != null;
        fileName = "novice_guide" + fileName.substring(fileName.lastIndexOf("."));

        // 图片存储目录及图片名称
//        String urlPath = "images/guide" + File.separator + fileName;
        String urlPath = "images/guide/" + fileName;
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
            NoviceGuideEntity noviceGuideEntity = new NoviceGuideEntity();
            noviceGuideEntity.setNoviceGuideId(0);
            if (!img.isEmpty()) {
                noviceGuideEntity.setImg("http://" + host + ":8080/" + urlPath);
            }
            if (!content.isEmpty()) {
                noviceGuideEntity.setContent(content);
            }
            this.updateById(noviceGuideEntity);

        } catch (IOException e) {
            System.err.println("NoviceGuideServiceImpl:  saveNoviceGuide:" + e);
        }
    }
}
