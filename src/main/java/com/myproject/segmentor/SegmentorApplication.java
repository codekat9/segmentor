package com.myproject.segmentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@SpringBootApplication
public class SegmentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegmentorApplication.class, args);
	}

	@Bean
	public Docket SwaggerConfiguration(){

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/contact/*"))
				.apis(RequestHandlerSelectors.basePackage("com.myproject.segmentor"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Contact API",
				"Contact API to Create new contacts and Query stored contacts.",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Aniket Mohapatra","","aniket.mohapatra.in@gmail.com"),
				"API License",
				"",
				Collections.emptyList()
		);
	}

}
