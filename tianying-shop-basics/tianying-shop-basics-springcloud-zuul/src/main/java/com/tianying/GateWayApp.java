/**
 * 
 */
package com.tianying;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * @author wangzhanhua
 *
 * 2019年4月18日下午1:58:00
 */
@EnableSwagger2Doc
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@EnableApolloConfig
public class GateWayApp {
	@ApolloConfig
	private Config appConfig;
	public static void main(String[] args) {
		SpringApplication.run(GateWayApp.class, args);
	}

	// 添加文档来源
	@Component
	@Primary
	class DocumentationConfig implements SwaggerResourcesProvider {
		@Override
		public List<SwaggerResource> get() {
//			List resources = new ArrayList<>();
//			// app-itmayiedu-order
//			resources.add(swaggerResource("app-tianying-member", "/app-tianying-member/v2/api-docs", "2.0"));
//			resources.add(swaggerResource("app-tianying-weixin", "/app-tianying-weixin/v2/api-docs", "2.0"));
			return resources();
		}

		
		/**
		 * 从阿波罗服务器中获取resources
		 * 
		 * @return
		 */
		private List<SwaggerResource> resources() {

			List resources = new ArrayList<>();
			// app-itmayiedu-order
			// 网关使用服务别名获取远程服务的SwaggerApi
			String swaggerDocJson = swaggerDocument();
			JSONArray jsonArray = JSONArray.parseArray(swaggerDocJson);
			for (Object object : jsonArray) {
				JSONObject jsonObject = (JSONObject) object;
				String name = jsonObject.getString("name");
				String location = jsonObject.getString("location");
				String version = jsonObject.getString("version");
				resources.add(swaggerResource(name, location, version));
			}
			return resources;
		}

		/**
		 * 获取swaggerDocument配置
		 * 
		 * @return
		 */
		private String swaggerDocument() {
			String property = appConfig.getProperty("tianying.zuul.swaggerDocument", "");
			return property;
		}

		private SwaggerResource swaggerResource(String name, String location, String version) {
			SwaggerResource swaggerResource = new SwaggerResource();
			swaggerResource.setName(name);
			swaggerResource.setLocation(location);
			swaggerResource.setSwaggerVersion(version);
			return swaggerResource;
		}



	}


}
