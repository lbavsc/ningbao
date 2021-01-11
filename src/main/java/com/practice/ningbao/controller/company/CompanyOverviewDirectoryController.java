package com.practice.ningbao.controller.company;


import com.practice.ningbao.entity.ResultEntity;
import com.practice.ningbao.service.company.CompanyOverviewDirectoryService;
import com.practice.ningbao.util.ResultUtil;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * 公司概况目录
 * @author lbavsc
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/company_overview_directory")
public class CompanyOverviewDirectoryController {

    @Autowired
    CompanyOverviewDirectoryService companyOverviewDirectoryService;

    @ApiParam("公司概况2级目录")
    @GetMapping("/get")
    public ResultEntity getDir() {
        try{
            return ResultUtil.success(companyOverviewDirectoryService.list());
        }catch (Exception e) {
            return ResultUtil.error("1002", "系统发生错误,请联系管理员");
        }
    }

    //// TODO: 2021/1/11 新增目录

    //// TODO: 2021/1/11 删除目录

    //// TODO: 2021/1/11 修改目录


}

