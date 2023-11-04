package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "platillos")
@Getter
@Setter
@NoArgsConstructor
public class PlatilloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platillo"/*, insertable=false, updatable=false*/)
    private Long idPlatillo;
    private String nombre;
    private float precio;
    private byte disponible;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCategoria", referencedColumnName = "id_categoria", foreignKey = @ForeignKey(name = "fk_cat_plat"))
    private CategoriaEntity categoria;
    @ManyToMany(fetch = FetchType.LAZY, cascade =             {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.PERSIST })
    @JoinTable(name = "ordenes", joinColumns = @JoinColumn(name = "idPlatillo", referencedColumnName = "id_platillo",
            foreignKey = @ForeignKey(name = "platillo_orden_fk")),
            inverseJoinColumns = @JoinColumn(name = "idReservacion",
                    referencedColumnName = "id_reservacion", foreignKey = @ForeignKey(name = "reservacion_orden_fk")))
    private List<ReservacionEntity> reservaciones;
}
