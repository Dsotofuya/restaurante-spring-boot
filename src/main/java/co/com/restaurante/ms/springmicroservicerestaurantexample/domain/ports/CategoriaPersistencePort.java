package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;

import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;

import java.util.List;

public interface CategoriaPersistencePort {
    CategoriaModel addCategoria(CategoriaModel categoriaModel);
    CategoriaModel updateCategoria(CategoriaModel categoriaModel);
    void deleteCategoria(Long id);
    List<CategoriaModel> getCategorias();
    CategoriaModel getCategoriaById(Long id);
}
