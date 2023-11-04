package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.adapters;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.CategoriaEntity;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.mappers.CategoriaMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaJpaAdapter implements CategoriaPersistencePort {

    private final CategoriaRepository categoriaRepository;

    @Override
    public CategoriaModel addCategoria(CategoriaModel categoriaModel) {
        CategoriaEntity categoriaEntity =
                CategoriaMapper.INSTANCE.mapToCategoriaEntity(categoriaModel);
        CategoriaEntity categoriaSaved = this.categoriaRepository.save(categoriaEntity);
        return CategoriaMapper.INSTANCE.mapToCategoriaModel(categoriaSaved);
    }

    @Override
    public CategoriaModel updateCategoria(CategoriaModel categoriaModel) {
        return addCategoria(categoriaModel);
    }

    @Override
    public void deleteCategoria(Long id) {
        this.categoriaRepository.deleteById(id);
    }

    @Override
    public List<CategoriaModel> getCategorias() {
        return CategoriaMapper.INSTANCE.mapToCategoriaModelList(
                this.categoriaRepository.findAll());
    }

    @Override
    public CategoriaModel getCategoriaById(Long id) {
        return this.categoriaRepository.findById(id)
                .map(CategoriaMapper.INSTANCE::mapToCategoriaModel)
                .orElse(null);
    }
}
