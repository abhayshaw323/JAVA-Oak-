import java.util.Scanner;

public class Basics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "Abhay "; // print the full sentence
        String t = "Shaw";
        System.out.println(s);
       // String t = sc.next();// print the words until spaces comes
       // System.out.println(t);
        System.out.println("Finding the length " + s.length());
        System.out.println("Finding the index of D "+s.indexOf('D'));
        System.out.println("To Lower Case "+s.toLowerCase());
        System.out.println("To Upper Case " + s.toUpperCase());
        System.out.println("Contains bha " +s.contains("bha"));
        System.out.println("Starts with A or not" + s.startsWith("A"));
        System.out.println("Ends with A or not "+s.endsWith("Y"));
        System.out.println("s is compare with t"+s.compareTo(t));
        System.out.println("cnacatenation " +s.concat(t));
        String  q = 10+4+" "+s+t+" "+200+03;
        System.out.println(q);
        String a = "jaishankar";
        System.out.println(a.substring(3 ));
        System.out.println(a.substring(0,10 ));// begining index is included and ending index is explicit
         
    }
}