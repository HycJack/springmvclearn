package com.HycJack.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *
 * @author huangyicao 2017/9/5 17:35
 * @param
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/9/5
 * @modify by reason:{原因}
 */
@Configuration
@EnableSwagger2
public class ApplicationSwaggerConfig {

    @Bean
    public Docket addUserDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        Contact contact = new Contact("HycJack Huang","https://github.com/HycJack","772403255@qq.com");
        ApiInfo apiInfo = new ApiInfo(
          "Spring Boot中使用Swagger2构建 RESTful Apis", "Api Document管理",
                "V1.0.0","huangyicao",contact,"",""
        );
        docket.select().apis(RequestHandlerSelectors.basePackage("com.HycJack.user")).build();
        docket.apiInfo(apiInfo);
        return docket;
    }

}
