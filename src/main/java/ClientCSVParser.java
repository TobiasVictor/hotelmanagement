import client.Client;
import hotel.Address;
import room.Room;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ClientCSVParser {
    public List<Client> parseClients(InputStream csvInputStream) throws IOException{

        byte[] buffer = new byte[5];
        int readBytes =  csvInputStream.read(buffer);
        StringBuilder builder = new StringBuilder();

        while(readBytes > 0){
            builder.append(new String(buffer,0,readBytes,"UTF-8"));
            readBytes =csvInputStream.read(buffer);
        }
        String readContent = builder.toString();
        String[] lines = readContent.split("\n");
        ArrayList<Client> clients = new ArrayList<>();



        for (String line:lines){
            String[] tokens = line.split(",");
            Client client = new Client(
                tokens[0],
                        tokens[1],
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3]),
                    Integer.parseInt(tokens[4]),
                    tokens[5],
                    tokens[6]);

            clients.add(client);

            }

            return clients;



        }







}
