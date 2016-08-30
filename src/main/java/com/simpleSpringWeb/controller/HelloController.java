package com.simpleSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年8月30日 下午10:06:40
 * @desc:
 */
@Controller
public class HelloController {
	@RequestMapping("/hi")
	public String sayHi(){
		return "hi";
	}
}

