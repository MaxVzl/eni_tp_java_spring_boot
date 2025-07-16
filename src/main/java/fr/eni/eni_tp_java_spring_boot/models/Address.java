package fr.eni.eni_tp_java_spring_boot.models;

//import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//@Entity
public class Address {
    @Id
    //@GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private String id;

    //@Column(nullable = false)
    private String street;

    //@Column(nullable = false)
    private String city;

    //@Column(nullable = false)
    private String postalCode;

    //@Column(nullable = false)
    private String country;
}
