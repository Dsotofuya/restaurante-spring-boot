package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.controller;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.mapper.CategoriaRestMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request.CategoriaInDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.CategoriaOutDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaServicePort categoriaServicePort;

    @PostMapping(value = "/add")
    public ResponseEntity<CategoriaOutDTO> addCategoria(@RequestBody CategoriaInDTO categoria){
        CategoriaModel categoriaModel = CategoriaRestMapper.INSTANCE.mapToCategoriaModel(categoria);
        CategoriaOutDTO categoriaOutDTO = CategoriaRestMapper.INSTANCE.
                mapToCategoriaOutDTO(
                        this.categoriaServicePort.addCategoria(categoriaModel));
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaOutDTO);
    }
}
