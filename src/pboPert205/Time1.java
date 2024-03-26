package pboPert205;

import java.text.DecimalFormat;

public class Time1 {
    public int hour;
    public int minute;
    public int second;


    public Time1(){
        setTime(0, 0, 0);
    }

    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h < 24) ? h : 0);
        minute = ((h>=0 && h < 60) ? m : 0);
        second = ((h>=0 && h < 60) ? s : 0);
    }

    public String toUniversalString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        return twoDigits.format(hour)+ ":" + twoDigits.format(minute) + ":" + twoDigits.format(second);
    }

    public String toString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" + twoDigits.format(minute) + ":" + twoDigits.format(second) + (hour < 12 ? " AM" : " PM");
    }
}
