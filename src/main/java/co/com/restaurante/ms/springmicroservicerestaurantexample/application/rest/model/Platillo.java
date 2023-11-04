package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Platillo {

    private Long idPlatillo;
    private String nombre;
    private float precio;
    private byte disponible;
    private Long categoriaId;
}
