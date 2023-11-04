package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.PlatilloNotFoundException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.PlatilloPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.PlatilloServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class PlatilloServiceImpl implements PlatilloServicePort {

    private final PlatilloPersistencePort platilloPersistencePort;

    @Override
    public PlatilloModel addPlatillo(PlatilloModel platilloModel) {
        return this.platilloPersistencePort.addPlatillo(platilloModel);
    }

    @Override
    public PlatilloModel updatePlatillo(PlatilloModel platilloModel) {
        return this.platilloPersistencePort.updatePlatillo(platilloModel);
    }

    @Override
    public void deletePlatillo(Long id) throws BusinessException {
        this.platilloPersistencePort.deletePlatillo(
                Optional.ofNullable(
                        this.platilloPersistencePort.getPlatilloById(id)
                ).orElseThrow(PlatilloNotFoundException::new).getIdPlatillo());
    }

    @Override
    public List<PlatilloModel> getPlatillos() {
        return this.platilloPersistencePort.getPlatillos();
    }

    @Override
    public PlatilloModel getPlatilloById(Long id) throws BusinessException {
        return Optional.ofNullable(
                this.platilloPersistencePort.getPlatilloById(id))
                .orElseThrow(PlatilloNotFoundException::new);
    }
}
