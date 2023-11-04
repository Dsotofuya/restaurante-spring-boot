package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.OrdenNotFoundException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.OrdenModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.OrdenPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.OrdenServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class OrdenServiceImpl implements OrdenServicePort {
    private final OrdenPersistencePort ordenPersistencePort;
    @Override
    public OrdenModel addOrden(OrdenModel ordenModel) {
        return this.ordenPersistencePort.addOrden(ordenModel);
    }

    @Override
    public OrdenModel updateOrden(OrdenModel ordenModel) {
        return this.ordenPersistencePort.updateOrden(ordenModel);
    }

    @Override
    public void deleteOrden(Long id) throws BusinessException {
        Optional<OrdenModel> ordenExist = Optional.ofNullable(
                this.ordenPersistencePort.getOrdenById(id));
        this.ordenPersistencePort.deleteOrden(
                ordenExist.orElseThrow(OrdenNotFoundException::new).getIdOrden());
    }

    @Override
    public List<OrdenModel> getOrdenes() {
        return this.ordenPersistencePort.getOrdenes();
    }

    @Override
    public OrdenModel getOrdenById(Long id) throws BusinessException {
        return Optional.ofNullable(
                this.ordenPersistencePort.getOrdenById(id))
                .orElseThrow(OrdenNotFoundException::new);
    }
}
