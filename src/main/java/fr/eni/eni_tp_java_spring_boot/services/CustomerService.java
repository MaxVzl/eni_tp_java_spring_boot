package fr.eni.eni_tp_java_spring_boot.services;

import fr.eni.eni_tp_java_spring_boot.models.Customer;
import fr.eni.eni_tp_java_spring_boot.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository clientRepository) {
        this.customerRepository = clientRepository;
    }

    public Iterable<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    public Customer findById(String id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    public Customer create(Customer client) {
        return this.customerRepository.save(client);
    }

    public Customer update(String id, Customer client) {
        if (this.customerRepository.existsById(id)) {
            client.setId(id);
            return this.customerRepository.save(client);
        }
        return null;
    }

    public void delete(String id) {
        if (this.customerRepository.existsById(id)) {
            this.customerRepository.deleteById(id);
        }
    }

    public Iterable<Customer> search(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            return this.customerRepository.findAll();
        }
        return this.customerRepository.findByLastNameContainingIgnoreCase(lastName);
    }
}
