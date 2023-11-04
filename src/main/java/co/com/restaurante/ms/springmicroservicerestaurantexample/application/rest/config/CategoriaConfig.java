package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.config;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaServicePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service.CategoriaServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoriaConfig {

    @Bean
    public CategoriaServicePort categoriaService(CategoriaPersistencePort categoriaPersistencePort){
        return new CategoriaServiceImpl(categoriaPersistencePort);
    }
}
