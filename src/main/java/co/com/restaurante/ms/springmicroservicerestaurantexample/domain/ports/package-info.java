/**
 *  El paquete de puertos contiene intefaces que poseen las funcionalidades
 *  que se usarán en la capa de aplicación y de dominio para poder realizar
 *  las operaciones sobre la capa de infraestructura.
 *  A pesar que las interfaces de persistencia y servicio tienen
 *  las mismas funcionalidades tienen propositos distintos.
 *
 *  Persistence: Consume los servicios expuestos de la capa de infraestructura
 *              hacia la capa de dominio
 *  Service: Ofrece las funcionalidades hacia la capa de aplicacion
 *
 * @since 1.0
 * @author Daniel Soto Fuya
 * @version 1.0
 */
package co.com.restaurante.ms.springmicroservicerestaurantexample.domain.ports;