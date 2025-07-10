package com.example.Springbootwithtestingyoutube.service;

import com.example.Springbootwithtestingyoutube.dao.EmployeeRepository;
import com.example.Springbootwithtestingyoutube.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  EmployeeRepository repository;
  @Override
  public Employee create(Employee employee) {
    return repository.save(employee);
  }

  @Override
  public List<Employee> getAll() {
    return List.of();
  }

  @Override
  public Employee getById(Integer id) {
    return null;
  }
}
