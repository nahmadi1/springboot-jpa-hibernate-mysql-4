package org.mma.training.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.mma.training.java.spring.model.Employee;
import org.mma.training.java.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")//end point 
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

		try {

			Employee emplData = employeeRepository.save(employee);
			return new ResponseEntity<>(emplData,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.EXPECTATION_FAILED);	
		}

	}

	@GetMapping("/allEmployee")
	public ResponseEntity<List<Employee>> getAllEmployees(){

		List<Employee> employees = new ArrayList<>();

		try {
			employeeRepository.findAll().forEach(employees::add);
			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(employees,HttpStatus.OK);
		}catch (Exception ex) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}




