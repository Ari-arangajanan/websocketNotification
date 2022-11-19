package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.ListOfNofification;

public interface NotificationRepo extends JpaRepository<ListOfNofification, Integer>{



}
