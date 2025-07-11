package com.example.Springbootwithtestingyoutube.controller;


import com.example.Springbootwithtestingyoutube.dto.EmployeeDTO;
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
  @GetMapping("getDataByid/{id}")
  public ResponseEntity<Employee> fetchByID(@PathVariable Integer id){
    Employee emp=employeeService.getById(id);
    return new ResponseEntity<>(emp, HttpStatus.OK);
  }
  @PutMapping("updateEmployee/{id}")
  public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDTO dto,@PathVariable Integer id){
    System.out.println(id);
   Employee employee= employeeService.uddateEmployee(dto, id);
   return new ResponseEntity<>(employee, HttpStatus.OK);

  }

  @DeleteMapping("deleteEmployee/{id}")
  public ResponseEntity<String> deleteById(@PathVariable Integer id){
    String  msg=employeeService.deleteEmployee(id);
    return new ResponseEntity<>(msg,HttpStatus.OK);
  }

  @GetMapping("fetchByName/{name}")
  public ResponseEntity<Employee> fetchByAnyField(@PathVariable String name){
    Employee  employee=employeeService.fetchByName(name);
    return new ResponseEntity<>(employee,HttpStatus.OK);
  }


}
