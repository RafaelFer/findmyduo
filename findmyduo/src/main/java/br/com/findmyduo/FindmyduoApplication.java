package br.com.findmyduo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"br.com.findmyduo.controller"})
@SpringBootApplication
public class FindmyduoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindmyduoApplication.class, args);
	}
}
