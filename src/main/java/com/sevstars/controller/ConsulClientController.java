/**  
 * 
 * @Title: CallHelloController.java  
 * @Package com.sevstars.education.controller  
 * @Description:  TODO  (用一句话描述该文件做什么)   
 * @author: 蛤蟆
 * @date:   2019年1月8日 下午10:50:57
 * @version V1.0 
 * @Copyright: 2019
 * 注意：公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.sevstars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulClientController")
public class ConsulClientController {

	@Autowired
	private LoadBalancerClient loadBalancer;
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/call")
	public String call() {
		ServiceInstance serviceInstance = loadBalancer.choose("consul-service-8081");
		System.out.println("服务地址：" + serviceInstance.getUri());
		System.out.println("服务名称：" + serviceInstance.getServiceId());

		String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello",
				String.class);
		System.out.println(callServiceResult);
		return callServiceResult;
	}

	/**
	 * 获取所有服务
	 */
	@RequestMapping("/services")
	public Object services() {
		return discoveryClient.getInstances("consul-serivce");
	}

	/**
	 * 从所有服务中选择一个服务（轮询）
	 */
	@RequestMapping("/discover")
	public Object discover() {
		return loadBalancer.choose("consul-service-8081").getUri().toString();
	}
}