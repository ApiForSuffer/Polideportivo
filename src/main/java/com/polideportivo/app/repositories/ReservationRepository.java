package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Long> {

}
