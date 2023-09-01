package dev.matheusvictor.hateoasyoutube.repository;

import dev.matheusvictor.hateoasyoutube.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
