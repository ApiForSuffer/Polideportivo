package com.polideportivo.app.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_PAYMENT")
public class Payment {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private LocalDateTime date;

    // relaciones
    @OneToOne   // one payment is registered for one reservation
    private Reservation reservation;

    @ManyToOne  // many payments can be done by one user
    @JsonBackReference
    private User user;


    // getters y setters
    public Long getId() {
        return this.id;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    public LocalDateTime getDate() {
        return this.date;
    }
    public Reservation getReservation() {
        return this.reservation;
    }
    public User getUser() {
        return this.user;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
