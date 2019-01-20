package com.sevstars.remote;



import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 调用生产者服务
 */
@FeignClient("consul-service")
public interface ProducerRemote {

    @GetMapping("/producer")
    String producer();
}
