import client.Client;
import hotel.Address;
import hotel.Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ClientCSVReader {
    public List<Client> readClients(Reader reader) throws IOException {

        ArrayList<Client> clients = new ArrayList<>();

        BufferedReader bufReader = new BufferedReader(reader);

        String line = bufReader.readLine();
        while (line != null) {
            String[] tokens = line.split(",");
            Client client = new Client(
                    tokens[0],
                    tokens[1],
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3]),
                    tokens[4],
                    tokens[5]);
            clients.add(client);
            line = bufReader.readLine();


        }
        return clients;
    }

}
