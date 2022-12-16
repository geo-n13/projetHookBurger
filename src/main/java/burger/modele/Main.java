package burger.modele;

import burger.controller.*;

public class Main {
    public static void main(String[] args) {

        Restaurant LeB = new Restaurant("Le B");
        Table Table1 = new Table(1);
        Table Table2 = new Table(2);


        LeB.tables.add(Table1);
        LeB.tables.add(Table2);


        Client client1 = new Client("Valentin");


        Client client2 = new Client("Benoit");
        Client client3 = new Client("Phillipe");


        client1.assoirTable(Table1);

        client2.assoirTable(Table2);
        client3.assoirTable(Table2);

        Burger burger1 = Burger.CHEESEBURGER;
        Burger burger2 = Burger.CHEESEBURGER;

        Burger burger3 = Burger.BURGERDUCHEF;
        Burger burger4 = Burger.CHICKENBURGER;

        client1.commandeBurger.add(burger1);
        client1.commandeBurger.add(burger2);

        client2.commandeBurger.add(burger3);
        client2.commandeBurger.add(burger4);

        LeB.getServeur().servirClient(client1);
        LeB.getServeur().servirClient(client2);
        LeB.getServeur().servirClient(client3);

        LeB.setChiffreAffaire();
        System.out.println(" Le chiffre d'affaire de "+LeB.getNom() +" est de "+ LeB.getChiffreAffaire());

    }
}