package com.mz.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.mz.cn.account.dao","com.mz.cn.plan.dao"})
public class MzApplication {

	public static void main(String[] args) {
		SpringApplication.run(MzApplication.class, args);
	}

}
