package client;
import lombok.*;
import person.Human;
import java.io.Serializable;
import java.lang.Object;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Client))
            return false;
        if (obj == this)
            return true;
        return this.clientCode == ((Client) obj).clientCode &&
                this.entryDate == ((Client) obj).entryDate &&
                this.getCnp() == ((Client) obj).getCnp() &&
                this.exitDate == ((Client) obj).exitDate;
    }


}
