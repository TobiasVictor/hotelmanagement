package client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements ClientInterface {
    private List<Client> clients = new ArrayList<>();

    @Override
    public boolean add(Client client) {
        clients.add(client);

        return true;
    }

    @Override
    public void remove(Client client) {
        clients.remove(client);

    }

    @Override
    public List<Client> listClients() {
        return clients;
    }
}
