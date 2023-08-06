package com.polideportivo.app.entities;

import com.polideportivo.app.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TB_SPORT")
public class Sport {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    private String description;

    // relaciones
    @OneToOne(mappedBy = "sport")   // one trainer imparts one sport
    private Trainer trainer;

}
