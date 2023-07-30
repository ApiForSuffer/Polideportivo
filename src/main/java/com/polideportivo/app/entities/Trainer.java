package com.polideportivo.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_TRAINER")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;

    @OneToMany(mappedBy = "trainer") // one trainer imparts several training sessions
    private List<TrainingSession> trainingSessions;

    @OneToOne // one trainer imparts one sport
    @JoinColumn(name = "sport_id", referencedColumnName = "id")
    private Sport sport;

}
