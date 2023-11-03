package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.OrdenModel;

import java.util.List;

public interface OrdenServicePort {
    OrdenModel addOrden(OrdenModel ordenModel);
    OrdenModel updateOrden(OrdenModel ordenModel);
    void deleteOrden(Long id) throws BusinessException;
    List<OrdenModel> getOrdenes();
    OrdenModel getOrdenById(Long id) throws BusinessException;
}
