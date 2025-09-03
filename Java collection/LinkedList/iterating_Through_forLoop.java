import java.util.*;
public class iterating_Through_forLoop {
    public static void main(String[] args) {
        LinkedList<String> weekdays = new LinkedList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thrusday");
        weekdays.add("Friday");
        weekdays.add("Satday");
        weekdays.add("Sunday");

        for(String day : weekdays)
        {
            System.out.println(day);
        }

    }
}
