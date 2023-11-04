package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.mapper;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request.CategoriaInDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.CategoriaOutDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.CategoriaEntity;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers.CategoriaMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaRestMapper {

    CategoriaRestMapper INSTANCE = Mappers.getMapper(CategoriaRestMapper.class);

    CategoriaModel mapToCategoriaModel(CategoriaInDTO categoriaInDTO);
    List<CategoriaModel> mapToCategoriaModelList(List<CategoriaInDTO> categoriaInDTOList);
    CategoriaOutDTO mapToCategoriaOutDTO(CategoriaModel categoriaModel);
    List<CategoriaOutDTO> mapToCategoriaOutDTOList(List<CategoriaModel> categoriaModelList);
}
