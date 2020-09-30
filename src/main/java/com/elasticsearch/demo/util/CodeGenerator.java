package com.elasticsearch.demo.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * mybatis-plus代码生成器
 */
public class CodeGenerator {

    public static void main(String[] args) {

        /**
         * 核心类
         */
        AutoGenerator mpg = new AutoGenerator();

        /**
         * 1、全局配置
         */
        GlobalConfig gc = new GlobalConfig();
        //生成代码输出目录
        gc.setOutputDir("D:\\demo");
        gc.setAuthor("fujh");
        //执行成功后是否弹出输输出目录
        gc.setOpen(true);
        //mybatis映射文件是否生成resultMap
        gc.setBaseResultMap(true);
        //mybatis映射文件是否生成CloumnList
        gc.setBaseColumnList(true);
        //设定实体类数date类型
        gc.setDateType(DateType.ONLY_DATE);
        //添加实体属性 Swagger2 注解
        gc.setSwagger2(true);

        //获取创建名：%s为占位符
        String createName= "%s";
        createName = createName.replace("T","");

        //设置实体类名称
        gc.setEntityName(createName);
        //设置控制层名称
        gc.setControllerName(createName+"Controller");
        //设置业务层名称
        gc.setServiceName(createName+"ServiceI");
        gc.setServiceImplName(createName+"Impl");
        //设置持久层名称
        gc.setMapperName(createName+"Repository");
        //设置mybatis映射文件名称
        gc.setXmlName(createName+"Mapper");

        mpg.setGlobalConfig(gc);


        /**
         * 2、数据源配置
         */
        DataSourceConfig dsc = new DataSourceConfig();
        //设置数据库类型
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/db_test?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("test");
        dsc.setPassword("test");
        mpg.setDataSource(dsc);


        /**
         * 3、包配置
         */
        PackageConfig pc = new PackageConfig();
        //设置父级包路径
        pc.setParent("com.elasticsearch.demo.student");
        //设置Entity名
        pc.setEntity("entity");
        //设置业务层包名
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        //设置持久层包名
        pc.setMapper("repository");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);


        /**
         * 4、策略配置
         */
        StrategyConfig strategy = new StrategyConfig();
        //设置自动生成的表
        strategy.setInclude(new String[]{"student_qd_info"});
        //设置表前缀
        strategy.setTablePrefix(new String[]{""});
        //设置表名生成策略,设置下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //设置是佛继承自定义的类
        strategy.setSuperControllerClass(null);
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        //设置是否为lombok模型
        strategy.setEntityLombokModel(true);

        mpg.setStrategy(strategy);

        /**
         * 5、模板配置（这里没了）
         */

        /**
         * 6、执行
         */
        mpg.execute();
    }

}
