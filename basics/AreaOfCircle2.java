import java.util.Scanner;
public class AreaOfCircle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double Radius = sc.nextDouble();
        double pi = 3.1415926535;
        double Area = pi * Radius * Radius;
        double Circumference = 2 * pi * Radius;
        System.out.println("Area of the circle is"+Area);
        System.out.println("Circumference of the circle is "+Circumference);
    }
}
