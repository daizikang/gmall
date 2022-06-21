package com.atguigu.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
@MapperScan(basePackages = "com.atguigu.gmall.product.mapper") //批量扫描就无需在每个Mapper接口上标注@Mapper
@SpringCloudApplication
public class ProductMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class,args);

    }
}
