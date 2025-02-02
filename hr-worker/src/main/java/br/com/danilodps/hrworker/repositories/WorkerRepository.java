package br.com.danilodps.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danilodps.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}