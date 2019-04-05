package person;

public class Client extends Human {

    public Client(String firstName, String lastName, int age, int clientCode, int entryDate, int exitDate) {
        super(firstName, lastName, age);
        this.clientCode=clientCode;
        this.entryDate=entryDate;
        this.exitDate=exitDate;

    }
    private int clientCode;
    private int entryDate;
    private int exitDate;

}
