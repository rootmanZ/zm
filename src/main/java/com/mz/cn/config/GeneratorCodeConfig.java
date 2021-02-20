package com.mz.cn.config;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * @Description <p></p>
 * @Author: Huanglin
 * @Date: 2021/2/18 15:27
 * @Version 0.0.1
 */
public class GeneratorCodeConfig {
    public static String scanner(String str) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder hel = new StringBuilder();
        hel.append("请输入:" + str + ":");
        System.out.println(hel.toString());
        if (scanner.hasNext()) {
            String t = scanner.next();
            if (null != t && !("".equals(t))) {
                return t;
            }
        }
        throw new MybatisPlusException("请输入正确的" + str + "！");
    }

    public static void main(String[] args) {
        //代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 获取当前项目路径
        String projectPath = System.getProperty("user.dir");
        //生成目录
        gc.setOutputDir(projectPath + "/src/main/java");
        // 设置作者
        gc.setAuthor("huanglin");
        // 是否打开资源管理器
        gc.setOpen(false);
        // 生成主键策略
        gc.setIdType(IdType.AUTO);
        mpg.setGlobalConfig(gc);

        //== 设置数据源 ==
        DataSourceConfig dsc = new  DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/daily?useSSL=false&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root123");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //== 包的配置 ==
        PackageConfig pag = new PackageConfig();

        // 设置模块名
        pag.setModuleName("mz");
        // 放在哪个包下
        pag.setParent("com.mz.cn");
        // 实体类包名
        pag.setEntity("entity");
        // 持久类包名
        pag.setMapper("dao");
        // 业务类包名
        pag.setService("service");
        // 控制类包名
        pag.setController("controller");
        mpg.setPackageInfo(pag);

        //== 策略配置 ==
        StrategyConfig teg = new StrategyConfig();
        // 要映射的表明
        teg.setInclude("plan");
        // 表明下划线转为驼峰
        teg.setNaming(NamingStrategy.underline_to_camel);
        // 列明下划线转驼峰
        teg.setColumnNaming(NamingStrategy.underline_to_camel);
        // 生成 @RestController 控制器
        teg.setRestControllerStyle(true);

        mpg.setStrategy(teg);
        mpg.execute();
    }
}
