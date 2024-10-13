package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends Person implements Pagable{
	private String deparmet;
	private double salary;
		
	//1. Constructor
	public Employee(String name, int age, String email, String rfc, String address, 	String deparmet, double salary) {
		super(name, age, email, rfc, address);
		this.deparmet = deparmet;
		this.salary = salary;
	}//Constructor

	//2. Getters and Setters
	public String getDeparmet() {
		return deparmet;
	}//getDepartament

	public void setDeparmet(String deparmet) {
		this.deparmet = deparmet;
	}//setDepartament

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	//3. toString()
	
	@Override
	public String toString() {
		return "Employee [deparmet=" + deparmet + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getRfc()=" + getRfc() + ", getEmail()=" + getEmail() + ", getAge()=" + getAge()
				+ ", getId()=" + getId() + "]";
	}//metodo toString	

	@Override
	public void setRfc(String rfc) {
		Pattern regex = Pattern.compile("^[A-ZÑ]{4}[0-9]{6}[A-Z0-9]{3}$");
		Matcher m = regex.matcher(rfc);
		if(m.matches()) {
			this.rfc = rfc;
		}
	}

	public String calculateSalary(int days) {
		// TODO Auto-generated method stub
		double total = 0;
		total = (this.salary * days) * 1.16;
		return String.format("%.2f", total);
	}//calculateSalary

	
}//class Employee
