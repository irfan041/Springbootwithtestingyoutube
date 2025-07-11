package com.example.Springbootwithtestingyoutube.controller;


import com.example.Springbootwithtestingyoutube.entity.Employee;
import com.example.Springbootwithtestingyoutube.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {
  @InjectMocks
  EmployeeController employeeController;
  @Mock
  EmployeeService employeeService;

  MockMvc mockMvc;
  ObjectMapper objectMapper;
  @BeforeEach
  public void setUp(){
    mockMvc=MockMvcBuilders.standaloneSetup(employeeController)
          .setControllerAdvice().build();
    this.objectMapper=new ObjectMapper();;
  }
  @Test
  public void createTest() throws Exception{
    this.mockMvc.perform(
          post("/employee/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(getEmployee()))
                .accept(MediaType.APPLICATION_JSON)

    ).andExpect(status().isOk());

    verify(employeeService).create(any(Employee.class));
  }

  private Employee getEmployee(){
    return  new Employee(1,"Allen","12345","USA");

  }



}
