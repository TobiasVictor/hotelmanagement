package person;

public class Client extends Human {

    private int clientCode;
    private String entryDate;
    private String exitDate;


    public Client(String firstName, String lastName, int age, int clientCode, String entryDate, String exitDate) {
        super(firstName, lastName, age);
        this.clientCode = clientCode;
        this.entryDate = entryDate;
        this.exitDate = exitDate;

    }

    public Client() {
        clientCode = 112;
        entryDate = "12.01.2019";
        exitDate = "15.01.2019";
    }


}
