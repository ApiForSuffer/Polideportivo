package com.polideportivo.app.service;

import com.polideportivo.app.entities.TrainingSession;
import com.polideportivo.app.repositories.TrainingSessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrainingSessionServiceImpl implements TrainingSessionService {
    
    private TrainingSessionRepository trainingSessionRepository;

    @Override
    public List<TrainingSession> getTrainingSessions() {
        return trainingSessionRepository.findAll();
    }

    @Override
    public TrainingSession getTrainingSessionById(Long id) {
        return trainingSessionRepository.findById(id).orElse(null);
    }

    @Override
    public TrainingSession addTrainingSession(TrainingSession trainingSession) {
        return trainingSessionRepository.save(trainingSession);
    }

    @Override
    public TrainingSession modifyTrainingSession(TrainingSession trainingSession, Long id) {
        return trainingSessionRepository.save(trainingSession);
    }

    @Override
    public void deleteTrainingSession(Long id) {
        trainingSessionRepository.deleteById(id);
    }
    
}
