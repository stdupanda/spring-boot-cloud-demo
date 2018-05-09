package cn.xz.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    private static final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);

    @Value("${swagger.enable:true}")
    private boolean isSwaggerEnabled;

    @Bean
    public Docket docket() {

        Predicate<String> paths;
        paths = PathSelectors.none();

        log.debug("swagger.enable: {}", isSwaggerEnabled);
        if (isSwaggerEnabled) {
            log.debug("swagger is enabled, will generate api docs.");
            paths = PathSelectors.any();
        } else {
            log.debug("swagger 未启用");
        }

        return new Docket(DocumentationType.SWAGGER_2).enable(isSwaggerEnabled).apiInfo(genApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("cn.xz")).paths(paths).build();
    }

    private ApiInfo genApiInfo() {
        String title = "项目 API 文档";
        String description = "描述接口定义";
        String version = "1.0";
        // String termsOfServiceUrl = "market@cecpay.com";
        // String license = "Copyright © All Rights Reserved";
        // String licenseUrl = "http://www.cecpay.com/";
        return new ApiInfoBuilder().title(title).description(description).version(version)
                // .termsOfServiceUrl(termsOfServiceUrl).license(license).licenseUrl(licenseUrl)
                .build();
    }
}
