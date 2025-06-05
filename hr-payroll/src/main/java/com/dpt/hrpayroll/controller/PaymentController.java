package com.dpt.hrpayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpt.hrpayroll.model.Payment;
import com.dpt.hrpayroll.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	private PaymentService service;

	public PaymentController(PaymentService service) {
		this.service = service;
	}
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
	
	

}
