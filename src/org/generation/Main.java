package org.generation;//debe ser la primer linea del codigo
import org.generation.classes.Consultor;
import org.generation.classes.Employee;
import org.generation.exceptions.EmailFormatException;

public class Main {
	public static void main(String[] args) {
		Employee luis = new Employee("Luis Fernando", 32, "fernando@email.com", "XAXX000000", "Address unknown", "IT", 450.25);
		
		Employee elena = new Employee("Elena Frias", 32, "elena@email.com", "XAXX000000", "Casa", "IT", 525.12);
		
		Consultor jose = new Consultor("Jose y asociados", "F&A20101013", 950);
		
		luis.setDeparmet("Software Development");
		
		//Person fercho = new Person("Fernando Cruz");
		
		try {
			luis.setEmail("fernandoemail.com");
		} catch (EmailFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		PayRoll.printReceipt(luis);
		PayRoll.printReceipt(elena);
		PayRoll.printReceipt(jose);
		
//		System.out.println(luis.toString());
//		System.out.println("****************************");
//		System.out.println(elena);//Llama a String.valueOf() que manda a llamar 
//		
//		System.out.println("Total de personas: " + Person.getTotal());

	}//main
}//Class Main
