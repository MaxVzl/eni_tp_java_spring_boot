package fr.eni.eni_tp_java_spring_boot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private Float dailyRentalRate;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer minAge;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Float avgDuration;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Genre> genres;
}
