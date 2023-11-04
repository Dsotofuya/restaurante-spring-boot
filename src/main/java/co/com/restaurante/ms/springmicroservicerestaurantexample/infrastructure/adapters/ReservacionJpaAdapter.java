package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.adapters;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.ReservacionModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.ReservacionPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.CategoriaEntity;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.ReservacionEntity;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers.CategoriaMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers.ReservacionMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository.CategoriaRepository;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository.ReservacionRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservacionJpaAdapter implements ReservacionPersistencePort {

    private final ReservacionRepository reservacionRepository;

    @Override
    public ReservacionModel addReservacion(ReservacionModel reservacionModel) {
        ReservacionEntity reservacionEntity = ReservacionMapper.INSTANCE.mapToReservacionEntity(reservacionModel);
        ReservacionEntity reservacionSaved = this.reservacionRepository.save(reservacionEntity);
        return ReservacionMapper.INSTANCE.mapToReservacionModel(reservacionSaved);
    }

    @Override
    public ReservacionModel updateReservacion(ReservacionModel reservacionModel) {
        return addReservacion(reservacionModel);
    }

    @Override
    public void deleteReservacion(Long id) {
        this.reservacionRepository.deleteById(id);
    }

    @Override
    public List<ReservacionModel> getReservaciones() {
        return ReservacionMapper.INSTANCE.mapToReservacionModelList(
                this.reservacionRepository.findAll());
    }

    @Override
    public ReservacionModel getReservacionById(Long id) {
        return this.reservacionRepository.findById(id).map(
                ReservacionMapper.INSTANCE::mapToReservacionModel)
                .orElse(null);
    }
}
