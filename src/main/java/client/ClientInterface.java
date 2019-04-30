package client;

import java.util.List;

public interface ClientInterface {
    boolean add(Client client);

    void remove(Client client);

    List<Client> listClients();
}
