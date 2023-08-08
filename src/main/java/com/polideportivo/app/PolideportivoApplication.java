package com.polideportivo.app;

import com.polideportivo.app.entities.Payment;
import com.polideportivo.app.entities.Reservation;
import com.polideportivo.app.entities.TrainingSession;
import com.polideportivo.app.entities.User;
import com.polideportivo.app.repositories.UserRepository;
import com.polideportivo.app.repositories.ReservationRepository;
import com.polideportivo.app.repositories.TrainingSessionRepository;
import com.polideportivo.app.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;


/* @Service // prueba para meter a mano a un usuario con reservas, pagos y trainingSes
class DataService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private TrainingSessionRepository trainingSessionRepository;

	public void initializeData() {
		User user = new User();
		user.setName("Jesulín");
		user.setLastName("De ubrique");
		user.setRegistrationDate(LocalDateTime.now());
		user.setPhone("7741004123");
		userRepository.save(user);

		// Create reservations
		Reservation reservation1 = new Reservation();
		reservation1.setDescription("descripción aleatoria");
		reservation1.setDate(LocalDateTime.now());
		reservation1.setUser(user);
		Reservation reservation2 = new Reservation();
		reservation1.setDescription("descripción aleatoria dos");
		reservation1.setDate(LocalDateTime.now());
		reservation1.setUser(user);

		reservationRepository.save(reservation1);
		reservationRepository.save(reservation2);

		// Create a training session
		TrainingSession trainingSession = new TrainingSession();
		trainingSession.setDescription("training cardio");
		trainingSession.setUser(user);
		trainingSession.setInitDate(LocalDateTime.now());
		trainingSession.setEndDate(LocalDateTime.now());

		trainingSessionRepository.save(trainingSession);

		// Create payments
		Payment payment1 = new Payment();
		payment1.setDate(LocalDateTime.now());
		payment1.setAmount(new BigDecimal(180.80));
		payment1.setUser(user);
		payment1.setReservation(reservation1);

		Payment payment2 = new Payment();
		payment2.setDate(LocalDateTime.now());
		payment2.setAmount(new BigDecimal(40));
		payment2.setUser(user);
		payment2.setReservation(reservation2);

		Payment payment3 = new Payment();
		payment3.setDate(LocalDateTime.now());
		payment3.setAmount(new BigDecimal(25.65));
		payment3.setUser(user);
		payment3.setReservation(reservation1);

		paymentRepository.save(payment1);
		paymentRepository.save(payment2);
		paymentRepository.save(payment3);

	}
} */

@SpringBootApplication
public class PolideportivoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PolideportivoApplication.class, args);
		/* DataService dataService = context.getBean(DataService.class);
		dataService.initializeData(); */
	}
}
