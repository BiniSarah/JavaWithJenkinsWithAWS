package com.spring.AWSApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/helloOne")
	public String Hello() {
		return "Haiiii...........HELLO.....!!!!";
	}

}
