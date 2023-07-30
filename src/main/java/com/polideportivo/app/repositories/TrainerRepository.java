package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository <Trainer, Long> {

}
