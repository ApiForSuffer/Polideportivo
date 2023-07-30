package com.polideportivo.app.entities;

import com.polideportivo.app.enums.EventType;
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
@Table(name = "TB_EVENT")
public class Event {
    // atributos
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private String description;
    private LocalDateTime date;
    private BigDecimal prize;

    // relaciones
    @OneToOne // one event is registered by one reservation
    private Reservation reservation;

}
