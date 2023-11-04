package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaModel mapToCategoriaModel(CategoriaEntity categoriaEntity);
    List<CategoriaModel> mapToCategoriaModelList(List<CategoriaEntity> categoriaEntityList);
    CategoriaEntity mapToCategoriaEntity(CategoriaModel categoriaModel);
    List<CategoriaEntity> mapToCategoriaEntityList(List<CategoriaModel> categoriaModelList);
}
