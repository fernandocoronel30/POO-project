//Indica que el pertenece al paquete org.generation.classes
package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.exceptions.EmailFormatException;

//abstract: se refiere a que no se puede crear un objeto o instancia de persona solo hereda
public abstract class Person {
	private String name;
	private int age;
	private String email;
	protected String rfc;
	private String address;
	private int id;	
	private static int total = 0;
	
	//constructor
	public Person(String name, int age, String email, String rfc, String address) {
		this.name = name.toUpperCase();
		this.age = (age <= 18) ? age : 18;
		this.email = email.toLowerCase();
		this.rfc = rfc;
		this.address = address;
		Person.total++;
		id = Person.total;
	}//constructor
	
	public Person(String name, int age, String email) {
		this(name, age, email,  "XAX000000", "su casa");
	}//constructor		
	
	//Generado por Source > Generate Constructor using Fields
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public String getAddress() {
		return address;
	}//getAddress

	public void setAddress(String address) {
		this.address = address;
	}//setAddress
	

//	public void setRfc(String rfc) {
//		this.rfc = rfc;
//	}//setRfc

	public Person(String name) {
		this(name, 18, "sincorreo@dominio.com");
	}//constructor
	
	public abstract void setRfc(String rfc);
	
	public String getRfc() {
		return this.rfc.toLowerCase();
	}//getRfc
		
	public void setEmail(String email) throws EmailFormatException {
		this.email = null;
		Pattern regex = Pattern.compile("^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$");
		Matcher m = regex.matcher(email);
		if(m.matches()) {
			this.email = email;			
		}else{
			throw new EmailFormatException(email + " no es un formato de correo correcto");	
		}//if
		
//		if( (email.contains("@")) && (email.contains(".")) ){
//			this.email = email;
//		}//if
	}//setEmail
	
	public String getEmail() {
		return (this.email != null) ? email.toLowerCase() : null;
	}//getEmail
	
	public void setAge(int age) {
		this.age = (age >= 18) ? age : 18;
	}//setAge
	
	public int getAge() {
		return this.age;
	}//getAge

	public int getId() {
		return id;
	}//getId

	public void setId(int id) {
		this.id = id;
	}//setId

	public static int getTotal() {
		return total;
	}//getTotal

	public static void setTotal(int total) {
		Person.total = total;
	}//setTotal

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ ", id=" + id + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getRfc()="
				+ getRfc() + ", getEmail()=" + getEmail() + ", getAge()=" + getAge() + ", getId()=" + getId() + "]";
	}

	//Generado desde Source > Generate toString()
	
	
//	public String toString() {
//		return "name = " + this.name + ", age = " + this.age + ", email = " + this.email + ", rfc = " + this.rfc + ", address = " + this.address;
//	}//metodo toString
}//class Person