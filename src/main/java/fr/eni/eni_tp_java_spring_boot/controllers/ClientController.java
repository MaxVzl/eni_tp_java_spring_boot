package fr.eni.eni_tp_java_spring_boot.controllers;

import fr.eni.eni_tp_java_spring_boot.models.Client;
import fr.eni.eni_tp_java_spring_boot.services.ClientService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public Client show(@PathVariable String id) {
        System.out.println("ok ok ok " + id);
        return this.clientService.findById(id);
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
