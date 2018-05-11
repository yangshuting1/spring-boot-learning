package com.sugar.springbootlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration    //让spring加载此类配置
@EnableSwagger2      //启动swagger2
public class Swagger2 {

    @Bean
    public Docket  createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sugar.springbootlearning"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("sugar xxx project RESTful APIs")
                .description("see more")
                .termsOfServiceUrl("https://github.com/yangshuting1")
                .contact("sugar")
                .version("1.0")
                .build();
    }
}
