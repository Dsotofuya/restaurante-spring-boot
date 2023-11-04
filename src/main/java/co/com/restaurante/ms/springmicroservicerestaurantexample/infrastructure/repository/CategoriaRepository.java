package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository;

import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}
