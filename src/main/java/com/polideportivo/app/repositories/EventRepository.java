package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository <Event, Long> {

}
