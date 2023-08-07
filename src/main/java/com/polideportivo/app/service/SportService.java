package com.polideportivo.app.service;

import com.polideportivo.app.entities.Sport;

import java.util.List;

public interface SportService {

    List<Sport> getSports();
    Sport getSportById(Long id);
    Sport addSport(Sport sport);
    Sport modifySport(Sport sport, Long id);
    void deleteSport(Long id);

}
