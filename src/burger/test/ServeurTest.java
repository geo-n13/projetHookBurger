package burger.test;

import burger.controller.Burger;
import burger.controller.Client;
import burger.controller.Restaurant;
import burger.controller.Table;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServeurTest {
    @Test
    public void testServirClient(){
        int prixBurger1 = 10;
        int prixBurger2 = 20;
        int prixBurger3 = 30;

        Restaurant restaurant = new Restaurant("Restaurant d'Eliott");
        Client client = new Client("Geo MERCORE", new ArrayList<Burger>());
        Table table = new Table(1);

        table.clients.add(client);
        restaurant.tables.add(table);

        table.setNote(prixBurger1 + prixBurger2 + prixBurger3);

        assertEquals(60, table.getNote());
    }
}
