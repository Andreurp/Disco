package net.andreu.gorila;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

	private final static String[] Noms = { "Pau", "Manel", "Marti", "Fadaric",
			"Mario", "Jon", "Anna", "Manel", "Pere", "Juan", "Maria", "Juana",
			"Tania", "Ariadna" };
	private final static String[] Sexe = { "Home", "Dona" };
	private final static String[] Calsat = { "sabates", "bambes", "sandalies" };

	private static final int NUM_PERSONES = 5;

	public static void main(String[] args) {

		// Random r = new Random();
		//
		// Condicio c = new Condicio(-1, "home", -1, "sabates");
		// Porter porter = new Porter();
		//
		// for(int i=0; i<NUM_PERSONES; i++){
		// Client client = new Client(Noms[r.nextInt(Noms.length)],
		// 16+r.nextInt(40), Sexe[r.nextInt(Sexe.length)],
		// 20+r.nextInt(100), Calsat[r.nextInt(Calsat.length)]);
		// System.out.println(client.toString());
		// }
		List<Client> client = Arrays.asList(new Client("Maria", 18, "dona", 10,
				"sabates"), new Client("Joan", 23, "home", 5, "bambes"),
				new Client("Marta", 20, "dona", 7, "bambes"), new Client(
						"Marc", 22, "home", 10, "sandalies"), new Client(
						"Pere", 20, "home", 25, "sabates"), new Client("Manel",
						21, "home", 50, "bambes"), new Client("Maria", 18,
						"dona", 8, "sandàlies"), new Client("Mercè", 25,
						"dona", 100, "sabates"), new Client("Joan", 17, "home",
						5, "bambes"));

		Condicio c = new Condicio(-1, "home", 10, "sabates");

		Porter porter = new Porter();

		System.out.println(porter.comprova(c, client));
	}
}
