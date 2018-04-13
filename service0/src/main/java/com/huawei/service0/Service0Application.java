package com.huawei.service0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service0Application
{
	@Value("${server.port}")
	String port;

	@GetMapping("/service")
	public String service()
	{
		return "i am from port:" + port;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(Service0Application.class, args);
	}
}
