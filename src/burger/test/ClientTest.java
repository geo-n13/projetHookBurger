package burger.test;

import burger.controller.Burger;
import burger.controller.Client;
import burger.controller.Table;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
public class ClientTest {
    @Test
    public void testAssoirTable(){
        Table table = new Table(1);
        Client client = new Client("Geo MERCORE", new ArrayList<Burger>());

        table.clients.add(client);

        assertEquals(1, table.getClients().size());
    }
}
