import java.util.*;
public class calendar_element {
    public static void main(String[] args) {
        HashSet<Calendar> dates = new HashSet<>();
        
        Calendar calendar = Calendar.getInstance();

        calendar.set(2024,5,1);
        dates.add(calendar);

        Calendar anothercalendar = calendar.getInstance();
        anothercalendar.set(2025,3 , 15);
        dates.add(anothercalendar);

        System.out.println(dates.size());
    }
}
