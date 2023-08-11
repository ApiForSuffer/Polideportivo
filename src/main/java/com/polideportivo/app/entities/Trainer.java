package com.polideportivo.app.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_TRAINER")
public class Trainer {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;

    // relaciones
    @OneToMany(mappedBy = "trainer") // one trainer imparts several training sessions
    private List<TrainingSession> trainingSessions;

    @OneToOne // one trainer imparts one sport
    @JoinColumn(name = "sport_id", referencedColumnName = "id")
    private Sport sport;

}
