import java.util.ArrayList;
public class insertElements {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(8);
        number.add(5);
        number.add(9);
        number.add(4);

        number.add(1,3);
        System.out.println(number);
    }
}
