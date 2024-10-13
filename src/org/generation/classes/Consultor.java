package org.generation.classes;

public class Consultor implements Pagable{
	private String razonSocial;
	private String RFC;
	private double costoHora;
	public Consultor(String razonSocial, String rFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		RFC = rFC;
		this.costoHora = costoHora;
	}//constructor
	public String getRazonSocial() {
		return razonSocial;
	}//getRazonsocial
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}//setRazonsocial
	
	public String getRFC() {
		return RFC;
	}//getRFC
	
	public void setRFC(String rFC) {
		RFC = rFC;
	}//setRFC
	
	public double getCostoHora() {
		return costoHora;
	}//getCostoHora
	
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}//setCostoHora
	
	@Override
	public String toString() {
		return "Consultor [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora
				+ ", getRazonSocial()=" + getRazonSocial() + ", getRFC()=" + getRFC() + ", getCostoHora()="
				+ getCostoHora() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.razonSocial.toUpperCase();
	}
	@Override
	public String getRfc() {
		// TODO Auto-generated method stub
		return this.RFC;
	}
	@Override
	public String getDeparmet() {
		// TODO Auto-generated method stub
		return "Consultor Externo";
	}
	@Override
	public String calculateSalary(int days) {
		// TODO Auto-generated method stub
		return String.format("%.2f", (costoHora * (days * 8)) * 1.16);
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
	
	
	
}//class Consultor
