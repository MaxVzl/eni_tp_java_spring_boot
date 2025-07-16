package fr.eni.eni_tp_java_spring_boot.models;

//import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//@Entity
public class Client {
    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    //@Column(nullable = false)
    private String firstName;

    //@Column(nullable = false)
    private String lastName;

    //@Column(unique = true, nullable = false)
    private String email;

    private String telephone;

    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;
}
