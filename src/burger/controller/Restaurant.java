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

	public void setChiffreAffaire(int chiffreAffaire){
		for (Table table : this.tables){
			for (Client client : table.getClients()){
				for (Burger burger : client.getCommandeBurger()){
					this.chiffreAffaire += burger.getPrixBurger();
				}
			}

		}
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}



}
