package com.example.Springbootwithtestingyoutube.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="myemp")
public class Employee {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String  salary;
  private String address;

}
