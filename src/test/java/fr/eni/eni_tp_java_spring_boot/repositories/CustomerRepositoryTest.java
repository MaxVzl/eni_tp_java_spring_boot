package fr.eni.eni_tp_java_spring_boot.repositories;

import fr.eni.eni_tp_java_spring_boot.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CustomerRepositoryTest {
    private CustomerService clientService;

    @Mock
    private CustomerRepository clientRepository;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
        clientService = new CustomerService(clientRepository);
    }
}
