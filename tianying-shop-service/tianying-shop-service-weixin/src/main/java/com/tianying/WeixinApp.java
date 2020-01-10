/**
 * 
 */
package com.tianying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * @author wangzhanhua
 *
 * 2019年4月16日下午3:51:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
@EnableApolloConfig
@EnableFeignClients
public class WeixinApp {

	/** 
	 *
	 * @param args
	 * date: 2019年4月16日 下午3:51:50
	 * @author wangzhanhua
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SpringApplication.run(WeixinApp.class, args);
	}

}
