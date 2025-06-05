package com.dpt.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.dpt.hrpayroll.model.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bob", 200.0, days);
	}

}
