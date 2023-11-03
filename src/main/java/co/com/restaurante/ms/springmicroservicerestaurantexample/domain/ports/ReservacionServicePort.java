package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.ReservacionModel;

import java.util.List;

public interface ReservacionServicePort {

    ReservacionModel addReservacion(ReservacionModel reservacionModel);
    ReservacionModel updateReservacion(ReservacionModel reservacionModel);
    void deleteReservacion(Long id) throws BusinessException;
    List<ReservacionModel> getReservaciones();
    ReservacionModel getReservacionById(Long id) throws BusinessException;
}
