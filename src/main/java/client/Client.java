package client;
import lombok.*;
import person.Human;
import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Client extends Human implements Serializable {

    private int clientCode;
    private String entryDate;
    private String exitDate;



    public Client(String firstName, String lastName, int age,int cnp, int clientCode, String entryDate, String exitDate) {
        super(firstName,lastName,age,cnp);
        this.clientCode = clientCode;
        this.entryDate = entryDate;
        this.exitDate = exitDate;

    }


}
