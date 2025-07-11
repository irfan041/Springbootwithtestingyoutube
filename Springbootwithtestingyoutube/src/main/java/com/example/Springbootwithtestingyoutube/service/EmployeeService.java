package com.example.Springbootwithtestingyoutube.service;

import com.example.Springbootwithtestingyoutube.dto.EmployeeDTO;
import com.example.Springbootwithtestingyoutube.entity.Employee;

import java.util.List;

public interface EmployeeService {

  public Employee create(Employee employee);
  public List<Employee> getAll();
  public Employee getById(Integer id);

  public Employee uddateEmployee(EmployeeDTO empDto, Integer id);
  public String deleteEmployee(Integer id);

  public Employee fetchByName(String name);

}
