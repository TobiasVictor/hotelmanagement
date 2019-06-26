package client;

import java.util.List;

public class ClientService {
    private   static  ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     *  Validate Client object and add it to the list.
     * @param client instance
     * @return value representing a status
     */
    public String validateAndAddClient(Client client) {
        //validation
        boolean responseFromRepo = clientRepository.add(client);
        if (responseFromRepo) {
            return "Client added with succes ";
        }
        clientRepository.add(client);
        return "Revise client parameters";
    }

    public void validateAndDeleteClient(Client client) {
        clientRepository.remove(client);
    }

    public  List<Client> getClients() {
        return clientRepository.listClients();
    }
}
