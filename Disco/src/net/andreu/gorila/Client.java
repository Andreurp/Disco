package net.andreu.gorila;

public class Client {

	private String nom;
	private int edad;
	private String sexe;
	private int diners;
	private String calsat;
	
	public Client(String nom, int edad, String sexe, int diners, String calsat) {
		super();
		this.nom = nom;
		this.edad = edad;
		this.sexe = sexe;
		this.diners = diners;
		this.calsat = calsat;
	}

	public String getNom() {
		return nom;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexe() {
		return sexe;
	}

	public int getDiners() {
		return diners;
	}

	public String getCalsat() {
		return calsat;
	}

	public String toString() {
		return "Nom=" + getNom() + ", Edad=" + getEdad() + ", Sexe=" + getSexe()
				+ ", diners=" + getDiners() + ", calsat=" + getCalsat();
	}
	
	
}
