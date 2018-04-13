package com.huawei.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1Application
{
	@Value("${server.port}")
	String port;

	@RequestMapping("/service")
	public String service2()
	{
		return "i am from port:" + port;
	}
	public static void main(String[] args)
	{
		SpringApplication.run(Service1Application.class, args);
	}
}
