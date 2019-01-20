/**  
 * 
 * @Title: HealthApiController.java  
 * @Package com.sevstars.service.controller  
 * @Description:  TODO  (用一句话描述该文件做什么)   
 * @author: 蛤蟆
 * @date:   2019年1月13日 下午3:13:41
 * @version V1.0 
 * @Copyright: 2019
 * 注意：公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.sevstars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("consulService")
public class HealthApiController {
	@GetMapping("/health")
    public String health(){
        return "hello consul";
    }
}
