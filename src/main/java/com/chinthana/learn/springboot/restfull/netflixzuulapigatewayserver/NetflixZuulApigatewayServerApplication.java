package com.chinthana.learn.springboot.restfull.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class NetflixZuulApigatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApigatewayServerApplication.class, args);
	}

}

