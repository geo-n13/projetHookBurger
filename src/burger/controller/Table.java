package burger.controller;

import burger.controller.Client;

import java.util.ArrayList;

public class Table {

	public int numero;
	public ArrayList<Client> clients;

	public double note;


	Table(int numero){
		this.numero = numero;
		this.clients = new ArrayList<>();
		this.note = 0;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}



}
