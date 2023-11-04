package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.mapper;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request.CategoriaInDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request.PlatilloInDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.CategoriaOutDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.PlatilloOutDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PlatilloRestMapper {
    PlatilloRestMapper INSTANCE = Mappers.getMapper(PlatilloRestMapper.class);

    PlatilloModel mapToPlatilloModel(PlatilloInDTO platilloInDTO);
    List<PlatilloModel> mapToPlatilloModelList(List<PlatilloInDTO> platilloInDTOList);
    PlatilloOutDTO mapToPlatilloOutDTO(PlatilloModel platilloModel);
    List<PlatilloOutDTO> mapToPlatilloOutDTOList(List<PlatilloModel> platilloModelList);
}
