package net.andreu.gorila;

import java.util.Random;

public class App {

	private final static String[] Noms = { "Pau", "Manel", "Marti", "Fadaric",
			"Mario", "Jon", "Anna", "Manel", "Pere", "Juan", "Maria", "Juana",
			"Tania", "Ariadna" };
	private final static String[] Sexe = { "Home", "Dona" };
	private final static String[] Calsat = { "sabates", "bambes", "sandatilles" };

	private static final int NUM_PERSONES = 5;

	public static void main(String[] args) {

		Random r = new Random();

		Condicio c = new Condicio(20, "Home", 50, "sabates");
		Porter porter = new Porter();

		for (int i = 0; i < NUM_PERSONES; i++) {
			Client client = new Client(Noms[r.nextInt(Noms.length)],
					16 + r.nextInt(40), Sexe[r.nextInt(Sexe.length)],
					20 + r.nextInt(100), Calsat[r.nextInt(Calsat.length)]);
			System.out.println(client.toString());
			System.out.println(porter.potEntrar(c, client));
			System.out.println("              ----------------------------");
		}
	}
}
