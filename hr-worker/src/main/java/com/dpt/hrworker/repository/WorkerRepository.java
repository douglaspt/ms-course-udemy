package com.dpt.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
