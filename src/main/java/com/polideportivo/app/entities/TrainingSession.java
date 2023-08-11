package com.polideportivo.app.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonBackReference
    private User user;


    // getters y setters
    public Long getId() {
        return this.id;
    }
    public String getDescription() {
        return this.description;
    }
    public LocalDateTime getInitDate() {
        return this.initDate;
    }
    public LocalDateTime getEndDate() {
        return this.endDate;
    }
    public Trainer getTrainer() {
        return this.trainer;
    }
    public User getUser() {
        return this.user;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setInitDate(LocalDateTime initDate) {
        this.initDate = initDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
