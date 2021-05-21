package com.tasks.api.bean;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
    
    @Bean
    public Docket swagger(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .apiInfo(metaInfo());
    
    }
    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
            "Cadastro de Tarefas",
            "API REST para cadastro de tarefas",
            "1.0",
            " Term of Service",
            new Contact("Diego Avila", "https://github.com/DiegoBorraz",
            "dieegob.avila@hotmail.com"),
            "Apache License Version 2.0",
            "Https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
