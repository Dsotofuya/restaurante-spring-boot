package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.Reservacion;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@RequiredArgsConstructor
public class ReservacionInDTO  extends Reservacion {
}
