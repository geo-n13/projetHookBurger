package burger.controller;

import burger.controller.Client;

import java.util.ArrayList;

public class Table {

	public int numero;
	public ArrayList<Client> clients;

	public double note;


	public Table(int numero){
		this.numero = numero;
		this.clients = new ArrayList<>();
		this.note = 0;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}




}
