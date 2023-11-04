package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity (name = "categorias")
@Setter
@Getter
@NoArgsConstructor
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_categoria"/*, insertable=false, updatable=false*/)
    private Long idCategoria;
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<PlatilloEntity> platillos;
}
