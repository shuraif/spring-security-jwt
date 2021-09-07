package com.ms.springsecurityjwt.mycontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

	@GetMapping("/authtest")
	public String authTest() {
		return "Authentication Success";
	}
}
