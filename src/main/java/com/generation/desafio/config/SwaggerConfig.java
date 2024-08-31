package com.generation.desafio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Collections;

@Configuration
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public OpenAPI apiAluno() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("apiAluno")
                                .description("depois escrevo ")
                                .version("v0.0.1")
                                .contact(new
                                        Contact()
                                        .name("")
                                        .email("")
                                        .url("")));
    }
/*   private ApiInfo customInfo() {
        return new ApiInfo(
                "ApiAl",
                "CodeFiction Project",
                "2.0",
                "Terms of service",
                new Contact("Caio Vinicius", "www.codefiction.net", "gabrieelplg@gmail.com"),
                "API license",
                "API license URL",
                Collections.emptyList());

    }*/

}
