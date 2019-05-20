package client;

import person.Human;

import java.io.Serializable;

public class Client extends Human implements Serializable {

    private int clientCode;
    private String entryDate;
    private String exitDate;


    public Client(String firstName, String lastName, int age, int clientCode, String entryDate, String exitDate) {
        super(firstName, lastName, age);
        this.clientCode = clientCode;
        this.entryDate = entryDate;
        this.exitDate = exitDate;

    }


}
