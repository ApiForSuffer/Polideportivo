package com.polideportivo.app.repositories;

import com.polideportivo.app.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment, Long> {

}
