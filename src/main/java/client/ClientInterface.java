package client;

import java.util.List;

public interface ClientInterface {
    /**
     * Add client
     *
     * @param client instance
     * @return true is inserted
     */






    boolean add(Client client);

    void remove(Client client);

    List<Client> listClients();
}
