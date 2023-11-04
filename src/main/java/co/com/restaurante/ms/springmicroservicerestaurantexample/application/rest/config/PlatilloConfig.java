package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.config;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.PlatilloPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.PlatilloServicePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service.PlatilloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlatilloConfig {

    @Bean
    public PlatilloServicePort platilloServicePort(PlatilloPersistencePort platilloPersistencePort){
        return new PlatilloServiceImpl(platilloPersistencePort);
    }
}
