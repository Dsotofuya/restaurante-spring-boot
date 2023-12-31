package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlatilloModel {

    private Long idPlatillo;
    private String nombre;
    private float precio;
    private byte disponible;
    private Long categoriaId;
}
