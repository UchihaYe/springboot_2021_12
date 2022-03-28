//package com.wys;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
//import java.util.ArrayList;
//
//public class AutoCode {
//    public static void main(String[] args) {
//        // 需要构建一个 代码自动生成器 对象
//        AutoGenerator mpg = new AutoGenerator();
//
//        //配置策略
//
//        //1.全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");//获取当前路径
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("王叶盛");
//        gc.setOpen(false);//是否打开资源管理器
//        gc.setFileOverride(true);//是否覆盖
//        gc.setServiceName("%sService");//去掉Service前面的I前缀
//        gc.setIdType(IdType.AUTO);
//        gc.setDateType(DateType.ONLY_DATE);
////        gc.setSwagger2(true);
//        mpg.setGlobalConfig(gc);
//
//        //设置数据源
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/wangwork? useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("266700");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//
//        //包的配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("work");
//        pc.setParent("com.wys");
//        pc.setEntity("entity");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setController("controller");
//        mpg.setPackageInfo(pc);
//
//        //策略配置
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setInclude("customer");
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
//
//
//        mpg.execute();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
