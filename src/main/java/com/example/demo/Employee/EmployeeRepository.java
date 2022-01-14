package com.example.demo.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT s FROM Employee s where s.name=?1")
    Optional<Employee> findEmployeeByName(String name);


    Optional<Employee> findEmployeeByEmail(String email);
}

