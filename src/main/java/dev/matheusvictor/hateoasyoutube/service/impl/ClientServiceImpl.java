package dev.matheusvictor.hateoasyoutube.service.impl;

import dev.matheusvictor.hateoasyoutube.domain.Client;
import dev.matheusvictor.hateoasyoutube.repository.ClientRepository;
import dev.matheusvictor.hateoasyoutube.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
}
