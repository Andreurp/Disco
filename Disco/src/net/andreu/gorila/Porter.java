package net.andreu.gorila;


public class Porter {

	public String potEntrar(Condicio c, Client client){
		if(c.comprovaEdad(client.getEdad()) &&
				c.comprovaSexe(client.getSexe()) &&
				c.comprovaCalsat(client.getCalsat()) && 
				c.comprovaDiners(client.getDiners())){
			return "Pot entrar";
		}
		return "No pot entrar";
	}	
}
