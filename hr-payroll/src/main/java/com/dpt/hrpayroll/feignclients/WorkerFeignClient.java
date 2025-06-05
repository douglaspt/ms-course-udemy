package com.dpt.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dpt.hrpayroll.model.Worker;


@Component
@FeignClient(name="hr-worker", url = "http://localhost:8001", path="/workers")
public interface WorkerFeignClient {
	
	@GetMapping("/{id}")
	ResponseEntity<Worker> findByID(@PathVariable Long id);

}
