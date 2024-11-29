package com.upiiz.examen2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Shipping API",
                description = "Esta API proporciona acceso a una tabla de envíos",
                version = "1.0.0",
                contact = @Contact(
                        name = "Caleb Trejo",
                        email = "etrejoa1801@alumno.ipn.mx"
                )
        )
)
public class OpenAPIConfig {
}

