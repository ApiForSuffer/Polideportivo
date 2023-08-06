package com.polideportivo.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_TRAININGSESSION")
public class TrainingSession {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDateTime initDate;
    private LocalDateTime endDate;

    // relaciones
    @ManyToOne  // many trainingSessions are imparted by one trainer
    private Trainer trainer;

    @ManyToOne  // many trainingSessions are taken by one user
    private User user;

}
