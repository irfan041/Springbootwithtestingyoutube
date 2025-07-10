package com.example.Springbootwithtestingyoutube.controller;


import com.example.Springbootwithtestingyoutube.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

  @GetMapping("create")
  public Employee create(){
    return null;
  }
}
