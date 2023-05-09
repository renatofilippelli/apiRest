package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface DriverRepository
    extends JpaRepository<Driver, Long>{
}

