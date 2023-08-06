package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository <Sport, Long> {

}
