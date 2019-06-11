package hotel;
import hotel.Hotel;
public class HotelStatisticsThread extends Thread {
    private Hotel hotel;
    private int counter;
    @Override
    public void run() {
        synchronized (this) {
            if (hotel.getQueue().size() == 0)
                try {
                    throw new Exception("Nothing to read");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            hotel.getQueue();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Thread  interrupted.");
            }
            counter = hotel.getQueue().size();
            System.out.println("Number of clients" + counter);

        }

    }
}
