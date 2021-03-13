package com.mz.cn.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description <p></p>
 * @Author: Huanglin
 * @Date: 2021/3/8 11:07
 * @Version 0.0.1
 */
@Configuration
public class MybatiesConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
