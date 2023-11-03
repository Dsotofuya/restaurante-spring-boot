package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Platillo {

    private Long id;
    private String nombre;
    private float precio;
    private byte disponible;
    private Long categoriaId;
}
