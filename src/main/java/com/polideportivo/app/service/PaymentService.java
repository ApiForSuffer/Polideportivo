package com.polideportivo.app.service;

import com.polideportivo.app.entities.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getPayments();
    Payment getPaymentById(Long id);
    Payment addPayment(Payment payment);
    Payment modifyPayment(Payment payment, Long id);
    void deletePayment(Long id);

}
