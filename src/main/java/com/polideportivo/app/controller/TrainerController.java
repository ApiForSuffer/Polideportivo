package com.polideportivo.app.controller;

import com.polideportivo.app.entities.Trainer;
import com.polideportivo.app.service.TrainerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/trainer")
@AllArgsConstructor
public class TrainerController {

    private TrainerService service;

    @GetMapping("/findall")
    public ResponseEntity<List<Trainer>> getTrainers() {
        return new ResponseEntity<>(service.getTrainers(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Trainer> getTrainerById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getTrainerById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer) {
        return new ResponseEntity<>(service.addTrainer(trainer), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<Trainer> modifyTrainer(@RequestBody Trainer trainer, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifyTrainer(trainer, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTrainer(@PathVariable Long id) {
        service.deleteTrainer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    
}
