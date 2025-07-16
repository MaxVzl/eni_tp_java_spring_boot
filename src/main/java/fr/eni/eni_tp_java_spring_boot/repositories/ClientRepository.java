package fr.eni.eni_tp_java_spring_boot.repositories;

import fr.eni.eni_tp_java_spring_boot.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {

    Iterable<Client> findByLastNameContainingIgnoreCase(String lastName);
}
