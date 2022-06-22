package com.atguigu.gmall.product;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MinioTest {

    @Autowired
    MinioClient minioClient;

}
