package com.dpt.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dpt.hrpayroll.feignclients.WorkerFeignClient;
import com.dpt.hrpayroll.model.Payment;
import com.dpt.hrpayroll.model.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker =  workerFeignClient.findByID(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
