package enums_hotel;

public enum HotelOpenTime {
    OPEN_TIME_OUTSIDE_HOLIDAYS("outside the holiday season ", 12),
    OPEN_TIME_ON_HOLIDAYS("holiday season", 24);

    private final String interval;
    private final int hoursNumber;

    HotelOpenTime(String interval, int hoursNumber) {
        this.interval = interval;
        this.hoursNumber = hoursNumber;
    }

    public String getInterval() {
        return interval;
    }

    public int getHoursNumber() {
        return hoursNumber;
    }

}
