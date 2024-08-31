package com.generation.desafio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collections;

@Configuration
@EnableWebMvc
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Aluno")
                        .description("Exemplo de gerenciamento de alunos")
                        .contact(new Contact()
                                .name("Caio Vinicius")
                                .email("caio.dev.conceicao@gmail.com")
                                .url("https://con6cao.github.io/portifolium/"))
                        .version("1.0")
                );
    }
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


