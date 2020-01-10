/**
 * 
 */
package com.tianying.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 基础设施，注册中心
 * @author wangzhanhua
 *
 * 2019年4月16日下午2:50:25
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp {

	/** 
	 *
	 * @param args
	 * date: 2019年4月16日 下午2:50:25
	 * @author wangzhanhua
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class, args);

	}

}
