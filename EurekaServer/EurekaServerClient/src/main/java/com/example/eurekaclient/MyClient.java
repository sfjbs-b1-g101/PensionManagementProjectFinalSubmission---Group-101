package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClient {

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello from the client";
	}
}
