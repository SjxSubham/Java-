import java.util.*;

public class Alarm {

    private int hour;
    private int minute;
    private int second;

    public Alarm(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        System.out.println("Alarm time: " + hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Alarm alarm = new Alarm(0, 0, 0);
        alarm.display();
    }
}