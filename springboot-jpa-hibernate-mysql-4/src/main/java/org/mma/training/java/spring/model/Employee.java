package org.mma.training.java.spring.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPL")
public class Employee {

	@Id
	private long empId;
	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate hiringDate;
	private String position;
	private String manager;
	private long salary;
	private double bonus;
	
	
	public Employee() {
		
	}


	public Employee(long empId, String firstName, String middleName, String lastName, LocalDate hiringDate,
			String position, String manager, long salary, double bonus) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.hiringDate = hiringDate;
		this.position = position;
		this.manager = manager;
		this.salary = salary;
		this.bonus = bonus;
	}


	public long getId() {
		return empId;
	}


	public void setId(long empld) {
		this.empId = empld;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getHiringDate() {
		return hiringDate;
	}


	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return "Employee [empld=" + empId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", hiringDate=" + hiringDate + ", position=" + position + ", manager=" + manager
				+ ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
