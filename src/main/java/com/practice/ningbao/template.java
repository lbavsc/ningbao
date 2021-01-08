package com.practice.ningbao;



import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class template {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setOpen(false);
        gc.setFileOverride(true);
        gc.setServiceName("%sService");
        gc.setIdType(IdType.ID_WORKER);
        gc.setAuthor("lbavsc");
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        gc.setBaseResultMap(true);
        mpg.setGlobalConfig(gc);


        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/ning_bao?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        mpg.setDataSource(dsc);


        PackageConfig pc = new PackageConfig();
        pc.setModuleName("ningbao");
        pc.setParent("com.practice");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        StrategyConfig st = new StrategyConfig();
        st.setInclude("carousel_news", "carousel_pic", "company_overview_content", "company_overview_directory",
                 "conntact_us", "news", "news_leaderboard", "novice_guide", "product_introduction_content",
                "product_introduction_directory", "recruitment", "site_settings", "token", "user");
        st.setNaming(NamingStrategy.underline_to_camel);
        st.setColumnNaming(NamingStrategy.underline_to_camel);
        st.setEntityLombokModel(true);
        TableFill craeteTime = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtUpdateTime = new TableFill("gmt_update", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(craeteTime);
        tableFills.add(gmtUpdateTime);
        st.setTableFillList(tableFills);
        st.setRestControllerStyle(true);
        st.setControllerMappingHyphenStyle(true);
        st.setVersionFieldName("version");
        st.setEntityTableFieldAnnotationEnable(true);
//        st.setEntityBooleanColumnRemoveIsPrefix(true);
        st.setLogicDeleteFieldName("is_delete");
        mpg.setStrategy(st);


        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };
        mpg.setCfg(cfg);

        mpg.execute();

    }
}


