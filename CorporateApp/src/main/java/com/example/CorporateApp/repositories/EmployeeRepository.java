package com.example.CorporateApp.repositories;

import com.example.CorporateApp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//now able to use CRUD oper-s by JPA repo
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
