package client;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


@Getter
public class CheckinData {
private LocalTime localTime= LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
private LocalDate localDate = LocalDate.now();

public String getTimeAndDate(){
    return " Client arrived at : " + localTime + "on " + localDate + "CheckIn Id: "+ Rng.checkInNumGenerator();

}
    public LocalDate getDate() {
        return localDate;
    }

    public LocalTime getTime() {
        return localTime;
    }

}




