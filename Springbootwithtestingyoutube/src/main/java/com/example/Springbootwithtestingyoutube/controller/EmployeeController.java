package com.example.Springbootwithtestingyoutube.controller;


import com.example.Springbootwithtestingyoutube.entity.Employee;
import com.example.Springbootwithtestingyoutube.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
@Autowired
  EmployeeService employeeService;

  @PostMapping("create")
  public ResponseEntity<Employee> create(@RequestBody Employee employee){
    Employee emp=employeeService.create(employee);
    return new ResponseEntity<>(emp, HttpStatus.OK);
  }

  @GetMapping("getData")
  public ResponseEntity<List<Employee>> fetchAllEmployee(){
    List<Employee> emp=employeeService.getAll();
    return new ResponseEntity<>(emp, HttpStatus.OK);
  }
}
