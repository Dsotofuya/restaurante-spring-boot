package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

    private int code;
    private String cause;
}
