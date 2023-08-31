package dev.matheusvictor.hateoasyoutube.repository;

import dev.matheusvictor.hateoasyoutube.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
