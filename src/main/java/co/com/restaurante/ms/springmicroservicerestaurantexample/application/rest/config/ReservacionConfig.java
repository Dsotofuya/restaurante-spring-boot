package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.config;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.ReservacionPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.ReservacionServicePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service.ReservacionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReservacionConfig {

    @Bean
    public ReservacionServicePort reservacionServicePort(ReservacionPersistencePort reservacionPersistencePort){
        return new ReservacionServiceImpl(reservacionPersistencePort);
    }
}
