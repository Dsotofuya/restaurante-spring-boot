package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.service;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.CategoriaNotFoundException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaPersistencePort;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CategoriaServiceImpl implements CategoriaServicePort {

    /** inteface o servicio de persistencia que provee
     * las funcionalidades de crud hacia la entidad.
     *
     * Es private final porque se garantiza que la inicialización es a nivel de constructor*/
    private final CategoriaPersistencePort categoriaPersistencePort;

    @Override
    public CategoriaModel addCategoria(CategoriaModel categoriaModel) {
        return this.categoriaPersistencePort.addCategoria(categoriaModel);
    }

    @Override
    public CategoriaModel updateCategoria(CategoriaModel categoriaModel) {
        return this.categoriaPersistencePort.updateCategoria(categoriaModel);
    }

    @Override
    public void deleteCategoria(Long id) throws BusinessException {
        Optional<CategoriaModel> existCategoria =  Optional.ofNullable(
                this.categoriaPersistencePort.getCategoriaById(id));
        this.categoriaPersistencePort.deleteCategoria(
                existCategoria.orElseThrow(CategoriaNotFoundException::new).getIdCategoria());
    }

    @Override
    public List<CategoriaModel> getCategorias() {
        return this.categoriaPersistencePort.getCategorias();
    }

    @Override
    public CategoriaModel getCategoriaById(Long id) throws BusinessException {
        return Optional.ofNullable(
                this.categoriaPersistencePort.getCategoriaById(id)
                ).orElseThrow(CategoriaNotFoundException::new);
    }
}