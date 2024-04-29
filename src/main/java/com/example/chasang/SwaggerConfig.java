package com.example.chasang;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "투개더 API 명세서",
        description = "COMP322-team12 투개더 API 명세서",
        version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

}
