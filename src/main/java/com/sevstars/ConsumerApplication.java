/**  
 * 
 * @Title: ConsumerApplication.java  
 * @Package com.sevstars  
 * @Description:  TODO  (用一句话描述该文件做什么)   
 * @author: 蛤蟆
 * @date:   2019年1月13日 下午3:25:32
 * @version V1.0 
 * @Copyright: 2019
 * 注意：公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.sevstars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
//		new SpringApplicationBuilder(ConsumerApplication.class).web(true).run(args);
	}
}
