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
@Table(name = "TB_RESERVATION")
public class Reservation {
    // atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDateTime date;
    private boolean status;
    private Long userId;
    private Long eventId;

    // relaciones
    @ManyToOne // many reservations can be done by one user
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne // one reservation pertains to one event
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @OneToOne(mappedBy = "reservation") // one reservation is done by one payment
    private Payment payment;
    // cambio
}
