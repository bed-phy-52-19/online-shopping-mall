package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

//@EnableSwagger2
//@RequestMapping(path ="api")

@SpringBootApplication
public class DemoApplication {
	@Primary
	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
	}
	public ApiInfo apiInfo(){
		return new ApiInfo(
				"online shopping mall",
				"online shopping mall has been designed by chisomo sadick bed-phy-52-19 inorder for people to access our services online. The website will enable our customers to post information of themselves so that we can know our customers and for delivary of goods and it will enable them to apdate their infomation, and delete information. it will also enable our employees to provide their infomation and enable them to update their infomation",
				"6.0",
				"terms and conditions",
				new Contact(
						"chisomo sadick","https://chisoonlineshopping.herokuapp.com/",
						"bed-phy-52-19@unima.ac.mw"),"app licence ","app licence URL",
				Collections.emptyList()

		);
	}


}
