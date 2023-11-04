package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.PlatilloEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PlatilloMapper{

    PlatilloMapper INSTANCE = Mappers.getMapper(PlatilloMapper.class);

    PlatilloModel mapToPlatilloModel(PlatilloEntity platilloEntity);
    List<PlatilloModel> mapToPlatilloModelList(List<PlatilloEntity> platilloEntityList);
    PlatilloEntity mapToPlatilloEntity(PlatilloModel platilloModel);
    List<PlatilloEntity> mapToPlatilloEntityList(List<PlatilloModel> platilloModelList);
}
