package fr.eni.eni_tp_java_spring_boot.services;

import fr.eni.eni_tp_java_spring_boot.models.Client;
import fr.eni.eni_tp_java_spring_boot.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Iterable<Client> findAll() {
        return this.clientRepository.findAll();
    }

    public Client findById(String id) {
        return this.clientRepository.findById(id).orElse(null);
    }
}
