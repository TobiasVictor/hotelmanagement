package hotelspecialrooms;

public class Pool implements Irooms {
    @Override
    public void openingTime() {
        System.out.println("Piscina se deschide in fiecare zi a saptamanii de la ora 7 AM pana la 10 PM");

    }

    @Override
    public void numberOfWorkersForThisRoom(int workers) {
        System.out.println("Numarul de angajati alocat pentru piscina este de " + workers);


    }

    @Override
    public void numberOfreservations(int reservations) {
        System.out.println("Numarul de rezervari pentru piscina a fost de : " + reservations + " rezervari");

    }
}
