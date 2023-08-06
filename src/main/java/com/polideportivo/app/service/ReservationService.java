package com.polideportivo.app.service;

import com.polideportivo.app.entities.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> getReservations();
    Reservation getReservationById(Long id);
    Reservation addReservation(Reservation reservation);
    Reservation modifyReservation(Reservation reservation);
    void deleteReservation(Long id);

}
