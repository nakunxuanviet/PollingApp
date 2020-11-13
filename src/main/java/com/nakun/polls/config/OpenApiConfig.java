//package com.nakun.polls.config;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
//@Configuration
//public class OpenApiConfig {
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                // Thiết lập các server dùng để test api
//                .servers( Arrays.asList(new Server().url("http://localhost:8080"),
//                        new Server().url("https://user.nakun.me")
//                ))
////                .servers(Lists.newArrayList(
////                        new Server().url("http://localhost:8080"),
////                        new Server().url("https://user.nakun.me")
////                ))
//                // info
//                .info(new Info().title("Polling Application API")
//                        .description("Polling OpenAPI 3.0")
//                        .contact(new Contact()
//                                .email("viettx@gmail.com")
//                                .name("nakun")
//                                .url("https://nakun.me/"))
//                        .license(new License()
//                                .name("Apache 2.0")
//                                .url("http://www.apache.org/licenses/LICENSE-2.0.html"))
//                        .version("1.0.0"));
//    }
//}
