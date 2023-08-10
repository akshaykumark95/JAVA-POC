package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PropertyDetails;

public interface PropertyDetailsRepo extends JpaRepository<PropertyDetails, Long> {

}
