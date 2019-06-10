package client;

import hotel.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientThread extends Thread {
private Hotel hotel;
private CheckinData checkinData;
private String hour;

    @Override
    public void run() {

            ClientThread clientThread = new ClientThread();
        if (checkinData.getDay()==0 || checkinData.getMonth()==0){
            try {
                throw  new  IllegalAccessException("Re enter checkin data ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        hotel.clientThreads().add(clientThread);
    }
}

