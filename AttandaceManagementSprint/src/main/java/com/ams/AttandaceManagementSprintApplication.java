package com.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/****
 * 
 * @author puspha
 *
 */
@SpringBootApplication
@EnableSwagger2
public class AttandaceManagementSprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttandaceManagementSprintApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cg.springTraineeCRUD")).build();
	}

}
