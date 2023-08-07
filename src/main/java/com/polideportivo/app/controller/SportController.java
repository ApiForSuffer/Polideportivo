package com.polideportivo.app.controller;

import com.polideportivo.app.entities.Sport;
import com.polideportivo.app.service.SportService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/sport")
@AllArgsConstructor
public class SportController {

    private SportService service;

    @GetMapping("/findall")
    public ResponseEntity<List<Sport>> getSports() {
        return new ResponseEntity<>(service.getSports(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Sport> getSportById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getSportById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Sport> addSport(@RequestBody Sport sport) {
        return new ResponseEntity<>(service.addSport(sport), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<Sport> modifySport(@RequestBody Sport sport, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifySport(sport, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSport(@PathVariable Long id) {
        service.deleteSport(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
