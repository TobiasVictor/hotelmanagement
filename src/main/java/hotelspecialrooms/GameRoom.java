package hotelspecialrooms;

public class GameRoom implements Irooms {
    @Override
    public void openingTime() {
        System.out.println("Camera de jocuri se deschide de luni pana vineri de la ora 10 AM pana la 10 PM ");
        System.out.println("In weekend programul este de la ora 11 AM pana la 8 PM");
    }

    public void numberOfWorkersForThisRoom(int workers) {
        System.out.println("numarul de angajati pentru camera de jocuri este : " + workers);

    }


    public void numberOfreservations(int reservations) {
        System.out.println(" Pentru ziua de azi avem un numar de : " + reservations + " rezervari ");

    }
}
