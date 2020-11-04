package org.mma.training.java.spring;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.mma.training.java.spring.model.Employee;
import org.mma.training.java.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaHibernateMysql4Application implements CommandLineRunner {
 
	@Autowired
	EmployeeRepository employeeRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaHibernateMysql4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//	Employee emp1 = new Employee(5, "Hamed", "H", "Azizi", LocalDate.of(2017, 1, 13), "Software Engineer", "Tariq", 85000, 0.3);
//	Employee emp2 = new Employee(6, "Nasrat", "na", "Ahmadi", LocalDate.of(2020,9, 28), "Accounting", "Tariq", 8000, 0.6);
//	Employee emp3 = new Employee(7, "Chouaib", "c", "chah", LocalDate.of(2018, 11, 15), "IT", "Tariq", 95000, 0.5);
//	Employee emp4 = new Employee(8, "Hameen", "H", "Azizi", LocalDate.of(2019, 1, 13), "Accounting", "Tariq", 8000, 0.4);
//	
//	List<Employee> employees = new ArrayList<>();
//	employees.add(emp1);
//	employees.add(emp2);
//	employees.add(emp3);
//	employees.add(emp4);
//		
//	employeeRepository.saveAll(employees);	
	
	}

}
