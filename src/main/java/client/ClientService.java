package client;

import java.util.List;

public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public String validateAndAddClient(Client client) {
        //validation
        boolean responseFromRepo = clientRepository.add(client);
        if (responseFromRepo) {
            return "Client added with succes ";
        }
        return "Revise client parameters";
    }

    public void validateAndDeleteClient(Client client) {
        clientRepository.remove(client);
    }

    public List<Client> getClients() {
        return clientRepository.listClients();
    }
}
