package burger.controller;

import java.util.ArrayList;

public class Serveur {
	
	public String nom;

	public Serveur(String nom){
		this.nom = nom;
	}

	public void servirClient(Client client){
		for (Burger burger : client.getCommandeBurger()){
			client.getTable().note +=  burger.getPrixBurger();
		}
	}

}
