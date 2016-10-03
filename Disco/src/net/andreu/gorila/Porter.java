package net.andreu.gorila;

import java.util.ArrayList;
import java.util.List;

public class Porter {

	public List<Client> comprova(Condicio condicio, List<Client> client) {

		List<Client> entren = new ArrayList();

		for (Client client : client) {

			if (condicio.comprovaEdad(client.getEdad())
					&& condicio.comprovaSexe(client.getSexe())
					&& condicio.comprovaCalsat(client.getCalsat())
					&& condicio.comprovaDiners(client.getDiners())) {
				entren.add(client);
			}
		}

		return entren;
	}
}
