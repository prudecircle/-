package com.yupi.malou.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 自定义 Swagger(knife4j) 接口文档的配置
 *
 * @author <a href="https://github.com/prudecircle">圈霸霸</a>
 */
@Configuration
@EnableSwagger2WebMvc
//让bin在特定环境下生效
@Profile({"dev", "test"})
public class SwaggerConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 这里一定要标注你控制器的位置
                .apis(RequestHandlerSelectors.basePackage("com.yupi.malou.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    /**
     * api 信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("码楼——编程学习交流圈子匹配系统")
                .description("码楼接口文档")
                .termsOfServiceUrl("https://github.com/prudecircle")
                .contact(new Contact("圈霸霸","https://github.com/prudecircle",""))
                .version("1.11")
                .build();
    }
}
