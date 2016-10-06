package net.andreu.gorila;

public class Condicio {

	private int edad;
	private String sexe;
	private int diners;
	private String calsat;
	
	public Condicio(int edad, String sexe, int diners, String calsat) {
		super();
		this.edad = edad;
		this.sexe = sexe;
		this.diners = diners;
		this.calsat = calsat;
	}
	
	public boolean comprovaEdad(int edadClient){
		if(edadClient == -1 || edadClient >= edad){
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("null")
	public boolean comprovaSexe(String sexeClient) {
		if (sexeClient == null || sexeClient.equals(sexe)) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("null")
	public boolean comprovaCalsat( String calsatClient) {
		if(calsatClient == null || calsatClient.equals(calsat)) {
			return true;
		}
		return false;
	}
	
	public boolean comprovaDiners(int dinersClient) {
		if(dinersClient == -1 || dinersClient >= diners){ 
			return true;
		}
		return false;
	}
}
