package hotelapp;

public class Room extends Hotel{
    public Room(String nume, int rating, int capacity) {
        super(nume, rating, capacity);
        this.orientation=orientation;
        this.height=height;
        this.width=width;
    }
    private String orientation;
    private double height;
    private double width;
}
