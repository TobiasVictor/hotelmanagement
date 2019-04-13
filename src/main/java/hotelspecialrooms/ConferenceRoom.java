package hotelspecialrooms;

public class ConferenceRoom implements Irooms{
    @Override
    public void openingTime() {
        System.out.println("Camera de conferinta se deschide doar la rezervari ");
    }

    public void numberOfWorkersForThisRoom(int workers) {
        System.out.println("Numarul de angajati alocat pentru camera de conferinte este de " + workers);
    }

    public void numberOfreservations(int reservations) {
        System.out.println("In urmatoarea luna avem un numar de "+ reservations+ "rezervari");

    }
}
