package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy		//api 网关
@EnableEurekaClient
public class RunAppZuul {
	public static void main(String[] args) {
		SpringApplication.run(RunAppZuul.class, args);
	}
}
