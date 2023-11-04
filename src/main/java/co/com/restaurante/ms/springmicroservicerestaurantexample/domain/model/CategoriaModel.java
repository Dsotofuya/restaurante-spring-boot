package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoriaModel {

    private Long idCategoria;
    private String nombre;
}
