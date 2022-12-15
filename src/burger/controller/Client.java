package burger.controller;

import burger.controller.Burger;

import java.util.ArrayList;

public class Client {
	public String nom;


	public Table table;

	public ArrayList<Burger> commandeBurger;


	public Client(String nom, ArrayList<Burger> burgers) {
		this.nom = nom;
		this.commandeBurger = burgers;

	}

	public void assoirTable(Table table){
		this.table = table;

		table.getClients().add(this);
	}

	public ArrayList<Burger> getCommandeBurger() {
		return commandeBurger;
	}

	public void setCommandeBurger(ArrayList<Burger> commandeBurger) {
		this.commandeBurger = commandeBurger;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}



}
