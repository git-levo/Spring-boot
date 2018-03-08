package com.e1858.building;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.e1858.building.dao" })
public class BuildingApplication {
	public static void main(String[] args) {
		SpringApplication.run(BuildingApplication.class, args);
	}
}
