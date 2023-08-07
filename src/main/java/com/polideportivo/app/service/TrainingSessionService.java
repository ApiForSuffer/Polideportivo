package com.polideportivo.app.service;

import com.polideportivo.app.entities.TrainingSession;

import java.util.List;

public interface TrainingSessionService {

    List<TrainingSession> getTrainingSessions();
    TrainingSession getTrainingSessionById(Long id);
    TrainingSession addTrainingSession(TrainingSession trainingSession);
    TrainingSession modifyTrainingSession(TrainingSession trainingSession, Long id);
    void deleteTrainingSession(Long id);
    
}
