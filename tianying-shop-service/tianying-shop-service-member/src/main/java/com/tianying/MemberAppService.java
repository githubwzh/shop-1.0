package com.tianying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
/**
 * 
 * @author wangzhanhua
 *
 * 2019年4月15日上午10:35:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2Doc
@EnableApolloConfig
@MapperScan(basePackages="com.tianying.member.mapper")
public class MemberAppService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SpringApplication.run(MemberAppService.class, args);
	}

}
