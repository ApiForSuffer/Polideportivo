package com.polideportivo.app.service;

import com.polideportivo.app.entities.Reservation;
import com.polideportivo.app.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User getUserById(Long id);
    User addUser(User user);
    User modifyUser(User user, Long id);
    void deleteUser(Long id);
    void deleteAllUsers();


}
