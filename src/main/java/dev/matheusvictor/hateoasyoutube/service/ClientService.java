package dev.matheusvictor.hateoasyoutube.service;

import dev.matheusvictor.hateoasyoutube.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getAllClients();

    Optional<Client> getClientById(Long id);

    Client saveClient(Client client);
}
