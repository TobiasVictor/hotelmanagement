
package hotelspecialrooms;

public class ConferenceRoom implements RoomInterface {
    @Override
    public String openingTime(int dayNumber) {
        if(dayNumber==1)
            return "Sedinta are loc de la 8 AM la 9 AM";
        else
            return "Programul depinde de rezervare";
    }

    @Override
    public int numberOfWorkersForThisRoom() {
        return 0;
    }

    @Override
    public int numberOfReservations() {
        return 0;
    }




}
