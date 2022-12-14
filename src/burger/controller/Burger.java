package burger.controller;

enum Burger {

	CHEESEBURGER("Cheese Burger", 6.50),
	DOUBLECHEESE("Doublecheese Burger", 8.00),
	CHICKENBURGER("Chicken Burger", 9.00),
	BURGERDUCHEF("Burger du Chef", 12.00);



	private  String nomBurger;
	private  double prixBurger;

	private Burger(String nomBurger, double prix) {
		this.nomBurger = nomBurger;
		this.prixBurger = prix;
	}


	public String getNomBurger() {
		return nomBurger;
	}

	public void setNomBurger(String nomBurger) {
		this.nomBurger = nomBurger;
	}

	public double getPrixBurger() {
		return prixBurger;
	}

	public void setPrixBurger(double prixBurger) {
		this.prixBurger = prixBurger;
	}
}
