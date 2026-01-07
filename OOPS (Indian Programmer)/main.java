// Method Overloading
import java.util.*;
public class main {
    public static int sum(int a , int b){
        return a+b;
    }
public static int sum(int a , int b ,int c){
    return a+b+c; 
}
    public static String sum(String x , String y ){
        return x+y;
    }




// public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(sum(5,7));
    System.out.println(sum(5,7,8));
    System.out.println(sum("Abhay ","Shaw"));
  }  
}
