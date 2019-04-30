package hotelspecialrooms;

public class Pool implements SpecialRoomInterface, InterfaceForPoolAndGameRoom {



    @Override
    public String openingTime(int dayNumber) {
        return null;
    }

    @Override
    public int numberOfWorkersForThisRoom() {
        return 0;
    }

    @Override
    public int numberOfReservations() {
        return 0;
    }


    @Override
    public String ageRestrict(int validAge) {
        if(validAge>=10){
            return "Permis";
        }
        else
            return "Respins";



    }

    @Override
    public String workersRestTime(int dayNumber) {
        return null;
    }


}
