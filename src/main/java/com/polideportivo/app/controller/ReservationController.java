package com.polideportivo.app.controller;


import com.polideportivo.app.entities.Reservation;
import com.polideportivo.app.entities.User;
import com.polideportivo.app.service.ReservationService;
import com.polideportivo.app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/reservation")
@AllArgsConstructor
public class ReservationController {

    private ReservationService service;
    private UserService userService;

    @GetMapping("/findall")
    public ResponseEntity<List<Reservation>> getReservations() {
        return new ResponseEntity<>(service.getReservations(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getReservationById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        return new ResponseEntity<>(service.addReservation(reservation), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<Reservation> modifyReservation(@RequestBody Reservation reservation, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifyReservation(reservation, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
        service.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
