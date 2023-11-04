package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.controller;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.mapper.CategoriaRestMapper;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.Categoria;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.request.CategoriaInDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.CategoriaOutDTO;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.BusinessException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.model.CategoriaModel;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports.CategoriaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping(value = "/update")
    public ResponseEntity<CategoriaOutDTO> updateCategoria(@RequestBody CategoriaInDTO categoria){
        CategoriaModel categoriaModel = CategoriaRestMapper.INSTANCE.mapToCategoriaModel(categoria);
        CategoriaOutDTO categoriaOutDTO = CategoriaRestMapper.INSTANCE
                .mapToCategoriaOutDTO(this.categoriaServicePort.updateCategoria(categoriaModel));
        return ResponseEntity.status(HttpStatus.OK).body(categoriaOutDTO);
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<CategoriaOutDTO>> getCategorias(){
        List<CategoriaOutDTO> categoriaListOutDTO = CategoriaRestMapper.INSTANCE
                .mapToCategoriaOutDTOList(this.categoriaServicePort.getCategorias());
        return ResponseEntity.status(HttpStatus.OK).body(categoriaListOutDTO);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<CategoriaOutDTO> getCategoriaById(@PathVariable Long id) throws BusinessException {
        CategoriaOutDTO categoriaOutDTO = CategoriaRestMapper.INSTANCE
                .mapToCategoriaOutDTO(this.categoriaServicePort.getCategoriaById(id));
        return ResponseEntity.status(HttpStatus.OK).body(categoriaOutDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity daleteCategoriaById(@PathVariable Long id) throws BusinessException {
        this.categoriaServicePort.deleteCategoria(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
