package burger.controller;

import burger.controller.Client;

import java.util.ArrayList;

public class Restaurant {



	private String nom;
	public ArrayList<Table> tables;



	private Serveur serveur;

	private double chiffreAffaire;

	public Restaurant(String nom){
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

	public Serveur getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
