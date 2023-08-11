package com.polideportivo.app.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_RESERVATION")
public class Reservation {
    // atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDateTime date;
    private boolean status;

    // relaciones
    @ManyToOne // many reservations can be done by one user
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

    @OneToOne // one reservation pertains to one event
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @OneToOne(mappedBy = "reservation") // one reservation is done by one payment
    private Payment payment;

    // getters y setters
    public Long getId() {
        return this.id;
    }
    public String getDescription() {
        return this.description;
    }
    public LocalDateTime getDate() {
        return this.date;
    }
    public boolean isStatus() {
        return this.status;
    }
    public User getUser() {
        return this.user;
    }
    public Event getEvent() {
        return this.event;
    }
    public Payment getPayment() {
        return this.payment;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
