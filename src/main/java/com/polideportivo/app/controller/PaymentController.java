package com.polideportivo.app.controller;

import com.polideportivo.app.entities.Payment;
import com.polideportivo.app.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polideportivo/v0.8/payment")
@AllArgsConstructor
public class PaymentController {

    private PaymentService service;

    @GetMapping("/findall")
    public ResponseEntity<List<Payment>> getPayments() {
        return new ResponseEntity<>(service.getPayments(), HttpStatus.OK);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getPaymentById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Payment> addPayment(@RequestBody Payment payment) {
        return new ResponseEntity<>(service.addPayment(payment), HttpStatus.OK);
    }

    @PutMapping("/modify/{id}")
    public ResponseEntity<Payment> modifyPayment(@RequestBody Payment payment, @PathVariable Long id) {
        return new ResponseEntity<>(service.modifyPayment(payment, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        service.deletePayment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
