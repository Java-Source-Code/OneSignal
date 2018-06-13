package com.onesignal.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Created by hiemseyha on 6/13/18.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.onesignal.controller"))
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());

    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "OneSignal Push Notification",
                "Api Push Notification for mobile client",
                "API TOS",
                "Terms of service",
                new Contact("Hiem Seyha", "www.gl-f.com", "s.hiem@gl-f.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}