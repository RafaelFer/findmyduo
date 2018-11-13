package br.com.findmyduo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

@ComponentScan(basePackages={"br.com.findmyduo.controller"})
@SpringBootApplication
@EnableSwagger2 //this
public class FindmyduoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindmyduoApplication.class, args);
	}


	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/findmybook");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}


}
