package pboPert205;

public class TimeTest {
    public static void main (String args[]){
        Time1 jam = new Time1();
        jam.setTime(2,2,0);
        String universal = jam.toUniversalString();
        String str = jam.toString();

        System.out.println(universal);
        System.out.println(str);

    }
}
