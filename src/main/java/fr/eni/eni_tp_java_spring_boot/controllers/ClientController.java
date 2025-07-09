package fr.eni.eni_tp_java_spring_boot.controllers;

import fr.eni.eni_tp_java_spring_boot.models.Client;
import fr.eni.eni_tp_java_spring_boot.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController implements BaseController<Client> {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    @GetMapping("")
    public Iterable<Client> index() {
        return this.clientService.findAll();
    }

    @Override
    public Client show(String id) {
        return null;
    }

    @Override
    public Client create(Client entity) {
        return null;
    }

    @Override
    public Client update(String id, Client entity) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
