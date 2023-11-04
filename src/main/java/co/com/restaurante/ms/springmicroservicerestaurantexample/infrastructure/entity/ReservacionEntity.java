package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity (name = "reservaciones")
@Getter
@Setter
@NoArgsConstructor
public class ReservacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion", insertable=false, updatable=false)
    private Long idReservacion;
    private String nombre;
    private String apellido;
    private LocalTime hora;
    private LocalDate fecha;
    private Long cantidadMesa;
    @ManyToMany(mappedBy = "reservaciones")
    private List<PlatilloEntity> platillos;
}
