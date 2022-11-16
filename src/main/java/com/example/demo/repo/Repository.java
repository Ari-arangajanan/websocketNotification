package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Defect;

public interface Repository extends JpaRepository<Defect, Integer>{

}
