package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Orden {

    private Long id;
    private Long platilloId;
    private Long reservacionId;
}
