package com.polideportivo.app.controller;

import com.polideportivo.app.entities.TrainingSession;
import com.polideportivo.app.service.TrainingSessionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/trainingsession")
@AllArgsConstructor
public class TrainingSessionController {

    private TrainingSessionService service;

    @GetMapping("/findall")
    public ResponseEntity<List<TrainingSession>> getTrainingSessions() {
        return new ResponseEntity<>(service.getTrainingSessions(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<TrainingSession> getTrainingSessionById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getTrainingSessionById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TrainingSession> addTrainingSession(@RequestBody TrainingSession trainingSession) {
        return new ResponseEntity<>(service.addTrainingSession(trainingSession), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<TrainingSession> modifyTrainingSession(@RequestBody TrainingSession trainingSession, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifyTrainingSession(trainingSession, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTrainingSession(@PathVariable Long id) {
        service.deleteTrainingSession(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
