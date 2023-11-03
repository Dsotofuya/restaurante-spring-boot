package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;

import java.util.List;

public interface PlatilloPersistencePort {
    PlatilloModel addPlatillo(PlatilloModel platilloModel);
    PlatilloModel updatePlatillo(PlatilloModel platilloModel);
    void deletePlatillo(Long id);
    List<PlatilloModel> getPlatillos();
    PlatilloModel getPlatilloById(Long id);
}
