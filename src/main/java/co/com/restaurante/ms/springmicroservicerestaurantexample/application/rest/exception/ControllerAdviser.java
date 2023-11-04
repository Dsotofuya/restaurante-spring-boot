package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.exception;

import co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response.ErrorResponse;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.CategoriaNotFoundException;
import co.com.restaurante.ms.springmicroservicerestaurantexample.domain.exception.PlatilloNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdviser extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CategoriaNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResponseCategoriaNotFound(CategoriaNotFoundException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).
                body(ErrorResponse.builder()
                        .code(404).cause("Categoria No encontrada").build());
    }

    @ExceptionHandler(PlatilloNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResponsePlatilloNotFound(CategoriaNotFoundException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).
                body(ErrorResponse.builder()
                        .code(404).cause("Platillo No encontrado").build());
    }
}
