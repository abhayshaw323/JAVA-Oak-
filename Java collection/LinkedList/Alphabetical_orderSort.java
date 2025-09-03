import java.util.*;
public class Alphabetical_orderSort{
    public static void main(String[] args) {
        LinkedList<String> naam = new LinkedList<>();
        naam.addLast("Abhay");
        naam.addLast("Animesh");
        naam.addLast("Abhijit");
        naam.addLast("Alice");
        naam.addLast("bob");
        naam.addLast("Bob");
        naam.addLast("Diana");

        System.out.println("The number are : " + naam);
        Collections.sort(naam);
        System.out.println("The sorted names are : " + naam);
    }
}


