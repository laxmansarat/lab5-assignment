package com.gl.lab5Assignment.GreatlearningLab5assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lab5Assignment.GreatlearningLab5assignment.Model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
 