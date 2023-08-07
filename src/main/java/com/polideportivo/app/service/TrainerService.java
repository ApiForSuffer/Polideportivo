package com.polideportivo.app.service;

import com.polideportivo.app.entities.Trainer;

import java.util.List;

public interface TrainerService {

    List<Trainer> getTrainers();
    Trainer getTrainerById(Long id);
    Trainer addTrainer(Trainer trainer);
    Trainer modifyTrainer(Trainer trainer, Long id);
    void deleteTrainer(Long id);
    
}
