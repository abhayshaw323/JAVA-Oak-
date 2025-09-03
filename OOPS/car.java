// Example 1 – Basic Class with Attributes and Methods.
//Create a simple class Animal with attributes and a method to display details
public class car {
String name;
int price;
String color;
public void displayinfo(){
    System.out.println("The name of this cars is "+name+ " of price Rs."+price+ " and color is "+color+".");
}

public static void main(String[] args){
    car cars = new car();
    cars.name = "Tesla";
    cars.price = 1000000;
    cars.color = "aqua-Blue";
    cars.displayinfo();
}
}
