/*Given two handsets,one containing the roll number of all the student who have got grade A in maths.
And the other set containing roll numbers of all the students who will be going to the international conference next month.
You have to store the roll number of all the student who are going to the international conference and have also got grade A in maths.*/
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        HashSet<Integer> roll_number1 = new HashSet<>();
        roll_number1.add(12301);
        roll_number1.add(12302);
        roll_number1.add(12303);
        roll_number1.add(12304);
        roll_number1.add(12305);
        roll_number1.add(123015);
        roll_number1.add(12306);

        System.out.println(roll_number1);
        
        HashSet<Integer> roll_number2 = new HashSet<>();
        roll_number2.add(12301);
        roll_number2.add(123015);
        roll_number2.add(123017);
        roll_number2.add(123018);
        roll_number2.add(123019);

        System.out.println(roll_number2);
        HashSet<Integer> roll_number1_and_roll_number2 = new HashSet<>();
      //  roll_number1.retainAll(roll_number2);
      //  System.out.println("The student who are going to the international conference and have also got grade A in maths " + roll_number1);
      for(int roll_no : roll_number1)
      {
        if(roll_number2.contains(roll_no)){
            roll_number1_and_roll_number2.add(roll_no);
        }
      }
      System.out.println(roll_number1_and_roll_number2);

        }
}
