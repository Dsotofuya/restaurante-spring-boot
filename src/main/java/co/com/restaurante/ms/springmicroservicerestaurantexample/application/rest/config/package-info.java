/**
 *  Ya que spring no detecta que los ServiceImpl no son dependencias
 *  no las inicializa es por esto que no se instancia y cuando el controlador
 *  necesita la instancia no la encuentra.
 *
 *  Es por esto que se crea una configuración global creando un bean
 *  que se asocia al servicio.
 *
 * @since 1.0
 * @author Daniel Soto Fuya
 * @version 1.0
 */
package co.com.restaurante.ms.springmicroservicerestaurantexample.application.rest.config;