package com.polideportivo.app.service;


import com.polideportivo.app.entities.Sport;
import com.polideportivo.app.repositories.SportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SportServiceImpl implements SportService {
    
    private SportRepository sportRepository;

    @Override
    public List<Sport> getSports() {
        return sportRepository.findAll();
    }

    @Override
    public Sport getSportById(Long id) {
        return sportRepository.findById(id).orElse(null);
    }

    @Override
    public Sport addSport(Sport sport) {
        return sportRepository.save(sport);
    }

    @Override
    public Sport modifySport(Sport sport, Long id) {
        return sportRepository.save(sport);
    }

    @Override
    public void deleteSport(Long id) {
        sportRepository.deleteById(id);
    }
    
}
