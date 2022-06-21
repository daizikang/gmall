package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Service
 * @Repository
 * @Component
 */
//所有Mapper组件都要放在Spring容器
@Mapper
public interface BaseCategory1Mapper extends BaseMapper<BaseCategory1> {
}

