package com.example.Springbootwithtestingyoutube.service;

import com.example.Springbootwithtestingyoutube.dao.EmployeeRepository;
import com.example.Springbootwithtestingyoutube.dto.EmployeeDTO;
import com.example.Springbootwithtestingyoutube.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  @Autowired
  EmployeeRepository repository;
  @Override
  public Employee create(Employee employee) {
    return repository.save(employee);
  }

  @Override
  public List<Employee> getAll() {
   return repository.findAll();

  }

  @Override
  public Employee getById(Integer id) {
    return repository.findById(id).orElse(null);

  }

  @Override
  public Employee uddateEmployee(EmployeeDTO empDto, Integer id){
    Employee employee= repository.findById(id).orElse(null);
    employee.setSalary(empDto.getSalary());
       employee.setAddress(empDto.getAddress());
    return repository.save(employee);
  }

  @Override
  public String deleteEmployee(Integer id){
   Employee employee= repository.findById(id).orElse(null);
    repository.delete(employee);
    return "Employee Deleted";
  }

  @Override
  public Employee fetchByName(String name) {
    return repository.findByName(name);
  }

}
