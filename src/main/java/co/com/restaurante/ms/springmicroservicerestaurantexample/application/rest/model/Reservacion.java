package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class Reservacion {

    private Long idReservacion;
    private String nombre;
    private String apellido;
    private LocalTime hora;
    private LocalDate fecha;
    private Long cantidadMesa;
}
