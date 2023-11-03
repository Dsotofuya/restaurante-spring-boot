package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.ReservacionNotFoundException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.ReservacionModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.ReservacionPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.ReservacionServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ReservacionServiceImpl implements ReservacionServicePort {

    private final ReservacionPersistencePort reservacionPersistencePort;
    @Override
    public ReservacionModel addReservacion(ReservacionModel reservacionModel) {
        return this.reservacionPersistencePort.addReservacion(reservacionModel);
    }

    @Override
    public ReservacionModel updateReservacion(ReservacionModel reservacionModel) {
        return this.reservacionPersistencePort.updateReservacion(reservacionModel);
    }

    @Override
    public void deleteReservacion(Long id) throws BusinessException {
        this.reservacionPersistencePort.deleteReservacion(
                Optional.ofNullable(
                        this.reservacionPersistencePort.getReservacionById(id))
                        .orElseThrow(ReservacionNotFoundException::new).getId());
    }

    @Override
    public List<ReservacionModel> getReservaciones() {
        return this.reservacionPersistencePort.getReservaciones();
    }

    @Override
    public ReservacionModel getReservacionById(Long id) throws BusinessException {
        return Optional.ofNullable(
                this.reservacionPersistencePort.getReservacionById(id))
                .orElseThrow(ReservacionNotFoundException::new);
    }
}
