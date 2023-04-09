package com.gl.lab5Assignment.GreatlearningLab5assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.lab5Assignment.GreatlearningLab5assignment.Service.EmployeeService;

@Controller
@RequestMapping("employees")
public class EmployeeController {
	EmployeeService empService;
	
	public EmployeeController(EmployeeService empService) {
		super();
		// TODO Auto-generated constructor stub
		this.empService = empService;
	}

	@GetMapping("/list")

	public String showEmpList(Model model) {
		model.addAttribute("emps", empService.getAllEmployees());
		
		return "employees-list";
	}
}
