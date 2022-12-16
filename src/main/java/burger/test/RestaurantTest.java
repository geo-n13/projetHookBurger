package burger.test;

import burger.controller.Burger;
import burger.controller.Client;
import burger.controller.Table;
import burger.controller.Restaurant;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    @Test
    public void testSetChiffreAffaire(){
        Restaurant restaurant = new Restaurant("Restaurant d'Eliott");
        Client client = new Client("Geo MERCORE");
        Table table = new Table(1);

        table.clients.add(client);
        restaurant.tables.add(table);
        restaurant.setChiffreAffaire();
        table.setNote(20);

        assertEquals(20, restaurant.getChiffreAffaire() + table.getNote());
    }
}
