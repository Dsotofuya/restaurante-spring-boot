package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.ReservacionModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.ReservacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReservacionMapper {

    ReservacionMapper INSTANCE = Mappers.getMapper(ReservacionMapper.class);

    ReservacionModel mapToReservacionModel(ReservacionEntity reservacionEntity);
    List<ReservacionModel> mapToReservacionModelList(List<ReservacionEntity> reservacionEntityList);
    ReservacionEntity mapToReservacionEntity(ReservacionModel reservacionModel);
    List<ReservacionEntity> mapToReservacionEntityList(List<ReservacionModel> reservacionModelList);


}
