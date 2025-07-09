package fr.eni.eni_tp_java_spring_boot.repositories;

import fr.eni.eni_tp_java_spring_boot.services.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ClientRepositoryTest {
    private ClientService clientService;

    @Mock
    private ClientRepository clientRepository;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
        clientService = new ClientService(clientRepository);
    }
}
