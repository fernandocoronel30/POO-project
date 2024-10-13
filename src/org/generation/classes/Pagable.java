package org.generation.classes;

public interface Pagable {
	//Definir los métodos necesarios para poder imprimir el recibo de un objeto Pagable
	public String getName();
	public String getRfc();
	public String getDeparmet();
	public String calculateSalary(int days);
	public int getId();
	
}//interface Pagable
