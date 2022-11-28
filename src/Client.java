import java.util.ArrayList;

public class Client {
	
	public String nom;
	public ArrayList<Burger> burgers;
	public float facture;
	
	Client(String nom, ArrayList<Burger> burgers,float facture){
		this.nom = nom;
		this.burgers = new ArrayList<>();
		this.facture = 0;
		
	}
	
	public void commanderBurger(Burger burger) {
		this.burgers.add(burger);
		this.facture = this.facture + burger.prix;
		
	}
	
	public void mangerBurger(Burger burger){
		this.burgers.remove(burger);
	}
	
	
	
	
}
