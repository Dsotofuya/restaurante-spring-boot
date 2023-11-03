package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.OrdenModel;

import java.util.List;

public interface OrdenPersistencePort {
    OrdenModel addOrden(OrdenModel ordenModel);
    OrdenModel updateOrden(OrdenModel ordenModel);
    void deleteOrden(Long id);
    List<OrdenModel> getOrdenes();
    OrdenModel getOrdenById(Long id);
}
