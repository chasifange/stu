package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public interface RunAppServer {
	public static void main(String[] args) {
		SpringApplication.run(RunAppServer.class, args);
	}
}
