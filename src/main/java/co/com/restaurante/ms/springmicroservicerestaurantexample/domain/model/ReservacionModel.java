package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class ReservacionModel {

    private Long idReservacion;
    private String nombre;
    private String apellido;
    private LocalTime hora;
    private LocalDate fecha;
    private Long cantidadMesa;

}
