import java.util.ArrayList;

public class Restaurant {
	
	public String nom;
	public ArrayList<Client> clients;
	public Serveur serveur;
	
	Restaurant(String nom){
		this.nom = nom;
		this.clients = new ArrayList<>();
		this.serveur = new Serveur();
	}

}
