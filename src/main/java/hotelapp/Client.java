package hotelapp;

public class Client {
    private int clientCode;
    private int entryDate;
    private int exitDate;

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public void setEntryDate(int entryDate) {
        this.entryDate = entryDate;
    }

    public void setExitDate(int exitDate) {
        this.exitDate = exitDate;
    }
    public Client(int clientCode, int entryDate, int exitDate){
        this.clientCode = clientCode;
        this.entryDate = entryDate;
        this.exitDate = exitDate;

    }
}
