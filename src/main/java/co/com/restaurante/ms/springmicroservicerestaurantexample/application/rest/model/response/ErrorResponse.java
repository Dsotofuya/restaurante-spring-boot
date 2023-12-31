package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {

    private int code;
    private String cause;
}
