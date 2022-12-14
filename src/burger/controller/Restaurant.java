package burger.controller;

import burger.controller.Client;

import java.util.ArrayList;

public class Restaurant {

	private String nom;
	public ArrayList<Table> tables;
	private Serveur serveur;

	private double chiffreAffaire;

	Restaurant(String nom){
		this.nom = nom;
		this.tables = new ArrayList<Table>();
		this.serveur = new Serveur("Romain");
		this.chiffreAffaire = 0;
	}


	public void setChiffreAffaire(){
		for (Table table : this.tables){
			for (Client client : table.getClients()){
				for (Burger burger : client.getCommandeBurger()){
					this.chiffreAffaire += burger.getPrixBurger();
				}
			}

		}
	}



}
