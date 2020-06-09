package cn.shop.generator;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @ClassName CodeGenerator
 * @Description 代码生成器
 * @Author
 * @Date 2020/6/9 23:33
 * @Version
 **/
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("");
        gc.setOutputDir("E:/dev-haha/workspace/mp-mysql-code/src/main/java");
        // 是否覆盖同名文件，默认是false
        gc.setFileOverride(true);
        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        /* 自定义文件命名，注意 %s 会自动填充表实体属性！ */
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert() {
//            // 自定义数据库表字段类型转换【可选】
//            @Override
//            public DbColumnType processTypeConvert(String fieldType) {
//                System.out.println("转换类型：" + fieldType);
//                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//                return super.processTypeConvert(fieldType);
//            }
//        });
        // mysql数据库
//        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/vsdb?characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
//        setDbColumnUnderline

        // 此处可以修改为您的表前缀
        strategy.setTablePrefix(new String[]{"shop"});
        // 表名生成策略(数据库表映射到实体的命名策略)(nochange 无改变)
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
//        strategy.setInclude(new String[]{"sp_attribute, sp_category, sp_consignee, sp_express, sp_goods, sp_goods_attr, sp_goods_cats, sp_goods_pics, sp_manager, sp_order, sp_order_goods, sp_permission, sp_permission_api, sp_report_1, sp_report_2, sp_report_3, sp_role, sp_type, sp_user, sp_user_cart"});
        strategy.setInclude("sp_manager","sp_user");

        // 排除生成的表
        // strategy.setExclude(new String[]{"test"});
        mpg.setStrategy(strategy);


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.shop");
//        pc.setModuleName("test");
        pc.setController("controller");
        pc.setEntity("model");
        pc.setService("service");
        pc.setMapper("mapper");
        pc.setXml("mapper.xml");
        mpg.setPackageInfo(pc);

        mpg.execute();
    }
}
