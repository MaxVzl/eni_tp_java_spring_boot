package fr.eni.eni_tp_java_spring_boot.repositories;

import fr.eni.eni_tp_java_spring_boot.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    Iterable<Customer> findByLastNameContainingIgnoreCase(String lastName);
}
