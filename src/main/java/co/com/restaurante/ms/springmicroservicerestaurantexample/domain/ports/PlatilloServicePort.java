package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;

import java.util.List;

public interface PlatilloServicePort {
    PlatilloModel addPlatillo(PlatilloModel platilloModel);
    PlatilloModel updatePlatillo(PlatilloModel platilloModel);
    void deletePlatillo(Long id) throws BusinessException;
    List<PlatilloModel> getPlatillos();
    PlatilloModel getPlatilloById(Long id) throws BusinessException;
}
