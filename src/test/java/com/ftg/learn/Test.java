package com.ftg.learn;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        FastAutoGenerator.create(" jdbc:postgresql://10.201.212.183:5432/DSSDev?currentSchema=design-system-service", "lll666", "123456")
                .globalConfig(builder -> {
                    builder.author("ly") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .outputDir("C:/Users/AVW36X672/IdeaProjects/ibm" + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ftg.learn.ibm"); // 设置父包名
//                            .moduleName("test") // 设置父包模块名
//                            .entity("model.entity") //设置entity包名
//                            .other("model.dto") // 设置dto包名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, finalProjectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径

                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_xmmx") // 设置需要生成的表名
                            .addTablePrefix("sys_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
//                .injectionConfig(consumer -> {
//                    Map<String, String> customFile = new HashMap<>();
//                    // DTO
//                    customFile.put("DTO.java", "/templates/entityDTO.java.ftl");
//                    consumer.customFile(customFile);
//                });
    }
}
