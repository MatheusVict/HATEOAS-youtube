package dev.matheusvictor.hateoasyoutube.controller;

import dev.matheusvictor.hateoasyoutube.domain.Client;
import dev.matheusvictor.hateoasyoutube.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        List<Client> allClients = clientService.getAllClients();
        return allClients.stream().map(client ->
                client.add(linkTo(methodOn(ClientController.class).getClientById(client.getId())).withSelfRel())
                ).toList();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id)
                .add(linkTo(methodOn(ClientController.class).getAllClients()).withRel("Return to all clients"));
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }
}
