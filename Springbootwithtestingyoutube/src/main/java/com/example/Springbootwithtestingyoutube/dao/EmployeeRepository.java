package com.example.Springbootwithtestingyoutube.dao;

import com.example.Springbootwithtestingyoutube.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
  public Employee findByName(String name);
}
