package com.example.api_rh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api_rh.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
