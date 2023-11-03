package co.com.restaurante.ms.springmicroservicerestaurantexample.controller;

import co.com.restaurante.ms.springmicroservicerestaurantexample.service.initService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class platillosController {

    @Autowired initService service;


    @Value("${XD}")
    private String xd;

    @GetMapping()
    public String greetings(){
      return "Prueba " + service.getGreeting() + " " + xd;
    }
}
