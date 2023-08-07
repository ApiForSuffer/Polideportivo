package com.polideportivo.app.service;


import com.polideportivo.app.entities.Trainer;
import com.polideportivo.app.repositories.TrainerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    
    private TrainerRepository trainerRepository;

    @Override
    public List<Trainer> getTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainerById(Long id) {
        return trainerRepository.findById(id).orElse(null);
    }

    @Override
    public Trainer addTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public Trainer modifyTrainer(Trainer trainer, Long id) {
        return trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepository.deleteById(id);
    }
    
}
