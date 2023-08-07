package com.polideportivo.app.controller;

import com.polideportivo.app.entities.Event;
import com.polideportivo.app.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/event")
@AllArgsConstructor
public class EventController {

    private EventService service;

    @GetMapping("/findall")
    public ResponseEntity<List<Event>> getEvents() {
        return new ResponseEntity<>(service.getEvents(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getEventById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Event> addEvent(@RequestBody Event event) {
        return new ResponseEntity<>(service.addEvent(event), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<Event> modifyEvent(@RequestBody Event event, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifyEvent(event, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        service.deleteEvent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
