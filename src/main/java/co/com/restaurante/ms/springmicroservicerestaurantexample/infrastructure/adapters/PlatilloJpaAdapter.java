package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.adapters;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.PlatilloModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.PlatilloPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.PlatilloEntity;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers.PlatilloMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository.PlatilloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatilloJpaAdapter implements PlatilloPersistencePort {

    private final PlatilloRepository platilloRepository;

    @Override
    public PlatilloModel addPlatillo(PlatilloModel platilloModel) {
        PlatilloEntity platilloEntity = PlatilloMapper.INSTANCE.mapToPlatilloEntity(platilloModel);
        PlatilloEntity platilloSaved = this.platilloRepository.save(platilloEntity);
        return PlatilloMapper.INSTANCE.mapToPlatilloModel(platilloSaved);
    }

    @Override
    public PlatilloModel updatePlatillo(PlatilloModel platilloModel) {
        return addPlatillo(platilloModel);
    }

    @Override
    public void deletePlatillo(Long id) {
        this.platilloRepository.deleteById(id);
    }

    @Override
    public List<PlatilloModel> getPlatillos() {
        return PlatilloMapper.INSTANCE.mapToPlatilloModelList(
                this.platilloRepository.findAll());
    }

    @Override
    public PlatilloModel getPlatilloById(Long id) {
        return this.platilloRepository.findById(id)
                .map(PlatilloMapper.INSTANCE::mapToPlatilloModel)
                .orElse(null);
    }
}
