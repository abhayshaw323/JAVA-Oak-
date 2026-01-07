import java.util.Random;
//import java.util.Random.*;
public class dice {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int randomnumber = rand.nextInt(6) + 1;
        System.out.println(randomnumber);
    }
    
}
