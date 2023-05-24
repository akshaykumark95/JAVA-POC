package com.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
