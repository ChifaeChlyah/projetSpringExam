package com.example.jwtspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.jwtspring.entities.Payment;

@CrossOrigin("*")
public interface PayementRepository extends JpaRepository<Payment, Long> {

}
