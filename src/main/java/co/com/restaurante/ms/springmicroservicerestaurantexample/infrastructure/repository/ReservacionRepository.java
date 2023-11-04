package co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.repository;

import co.com.restaurante.ms.springmicroservicerestaurantexample.infrastructure.entity.ReservacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository extends JpaRepository<ReservacionEntity, Long> {
}
