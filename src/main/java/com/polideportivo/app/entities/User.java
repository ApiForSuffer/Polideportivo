package com.polideportivo.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_USER")
public class User {
    // atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String lastName;
    private LocalDateTime registrationDate;
    private String phone;

    // relaciones
    @OneToMany(mappedBy = "user") // one user to many reservations
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "user") // one user to many training sessions
    private List<TrainingSession> trainingSessions;

    @OneToMany(mappedBy = "user") // one user to many payments
    private List<Payment> payments;

}
