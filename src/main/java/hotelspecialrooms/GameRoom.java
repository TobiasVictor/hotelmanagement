package hotelspecialrooms;

public class GameRoom implements RoomInterface, InterfaceForPoolAndGameRoom {

    private  int  validAge;
    private String message;
    @Override
    public String openingTime(int dayNumber) {
        switch (dayNumber) {
            case 1:
                message = "Camera de jocuri este deschisa luni de la 6 PM pana la 8 AM";
                break;
            case 2:
                message = "Camera de jocuri este deschisa marti de la 6 PM pana la 8 AM";
                break;
            case 3:
                message = "Camera de jocuri este deschisa miercuri de la 6 PM pana la 8 AM";
                break;


            case 4:
                message = "Camera de jocuri este deschisa joi de la 6 PM pana la 8 AM";
                break;
            case 5:
                message = "Camera de jocuri este deschisa vineri de la 6 PM pana la 8 AM";
                break;
            default:
                message = "Camera de jocuri este inchisa ";
                break;
        }
        return message;

    }


    public int numberOfWorkersForThisRoom() {
            return 10;
    }


    public int numberOfReservations() {
        return 5;
    }


    @Override
    public String ageRestrict(int validAge) {
        this.validAge = validAge;
        if (validAge>=12){
            return "Admis";
        }
        else
            return "Respins";




    }

    @Override
    public String workersRestTime(int dayNumber) {
        switch (dayNumber){
            case 1:
                return "Luni pauza de masa are loc de la 4 PM la 5 PM";
            case 2:
                return "Marti pauza de masa are loc de la 4 PM la 5 PM";
            case 3:
                return "Miercuri pauza de masa are loc de la 9 PM la 10 PM";
            case 4:
                return "Joi pauza de masa are loc de la 7 PM la 8 PM";
            case 5:
                return "Vineri pauza de masa are loc de la 2 PM la 3 PM";
             default:
                return "Mai si munciti, ce tot atatea pauze de masa? ";

        }



    }

}