package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingSessionRepository extends JpaRepository <TrainingSession, Long> {

}
