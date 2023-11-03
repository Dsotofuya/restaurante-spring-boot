package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.ReservacionModel;

import java.util.List;

public interface ReservacionPersistencePort {
    ReservacionModel addReservacion(ReservacionModel reservacionModel);
    ReservacionModel updateReservacion(ReservacionModel reservacionModel);
    void deleteReservacion(Long id);
    List<ReservacionModel> getReservaciones();
    ReservacionModel getReservacionById(Long id);
}
