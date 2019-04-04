package hotelapp;

public class Hotel {
    private String nume;
     public  void setNume(String nume){
         this.nume=nume;
     }

    private  int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }
    private  final int capacity;

    public  Hotel(String nume, int rating, int capacity){
        this.nume=nume;
        this.rating=rating;
        this.capacity=capacity;

    }


}
