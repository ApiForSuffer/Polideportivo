package com.polideportivo.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
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
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // one user to many reservations
    @JsonManagedReference
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // one user to many training sessions
    @JsonManagedReference
    private List<TrainingSession> trainingSessions = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // one user to many payments
    @JsonManagedReference
    private List<Payment> payments = new ArrayList<>();


    // getters y setters
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public LocalDateTime getRegistrationDate() {
        return this.registrationDate;
    }
    public String getPhone() {
        return this.phone;
    }
    public List<Reservation> getReservations() {
        return this.reservations;
    }
    public List<TrainingSession> getTrainingSessions() {
        return this.trainingSessions;
    }
    public List<Payment> getPayments() {
        return this.payments;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    public void setTrainingSessions(List<TrainingSession> trainingSessions) {
        this.trainingSessions = trainingSessions;
    }
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
