package client;

import  org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class Rng {

public static UUID hotelNumGenerator(){
    return UUID.randomUUID();
}
public  static  String checkInNumGenerator(){
    return  RandomStringUtils.randomNumeric(5);
}
public static Integer randomSlpTime(){
    return Integer.valueOf(RandomStringUtils.randomNumeric(1));
}
public static int randomHotel(int max,int min){
    return (int) (Math.random()*((max-min)+1)) + min;
}

}
