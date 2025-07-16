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
        return this.clientService.findById(id);
    }

    @Override
    @PostMapping("")
    public Client create(@RequestBody Client entity) {
        return this.clientService.create(entity);
    }

    @Override
    public Client update(String id, Client entity) {
        return this.clientService.update(id, entity);
    }

    @Override
    public void delete(String id) {

    }
}
