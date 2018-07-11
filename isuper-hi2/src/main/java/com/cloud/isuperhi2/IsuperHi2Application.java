package com.cloud.isuperhi2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class IsuperHi2Application {

	public static void main(String[] args) {

		SpringApplication.run(IsuperHi2Application.class, args);
	}

	@Value("${server.port}")
	public String port;

	@RequestMapping(value = "/hi")
	public String home(@RequestParam String name){
		return "hi "+name+", i am from port:"+port;
	}
}
