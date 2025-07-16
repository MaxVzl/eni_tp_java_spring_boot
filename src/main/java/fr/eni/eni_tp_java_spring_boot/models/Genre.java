package fr.eni.eni_tp_java_spring_boot.models;

//import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
//@Entity
public class Genre {
    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    //@Column(nullable = false)
    private String title;

    // @ManyToMany(fetch = FetchType.EAGER)
    private List<Game> games;
}
