package net.andreu.gorila;

public class Client {

	private String nom;
	private int edat;
	private String sexe;
	private int diners;
	
	public Client(String nom, int edat, String sexe, int diners) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.sexe = sexe;
		this.diners = diners;
	}

	public String getNom() {
		return nom;
	}

	public int getEdat() {
		return edat;
	}

	public String getSexe() {
		return sexe;
	}

	public int getDiners() {
		return diners;
	}
	
	
}
