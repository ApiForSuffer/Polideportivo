package com.polideportivo.app.service;

import com.polideportivo.app.entities.Event;

import java.util.List;

public interface EventService {

    List<Event> getEvents();
    Event getEventById(Long id);
    Event addEvent(Event event);
    Event modifyEvent(Event event, Long id);
    void deleteEvent(Long id);

}
