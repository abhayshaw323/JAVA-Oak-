//Using Constructors.
//Create a class vehicle that initailizes its attributes using a constructor.
public class Vehicle {
    String brand;
    int year;
    //Constructor with parameters
    public Vehicle(String brand,int year){
        this.brand = brand;
        this.year = year;
    }
    public void showinfo(){
        System.out.println("Brand:" +brand+ ",Year:"+year);
    }
    public static void main(String[] args){
        Vehicle car = new Vehicle("Toyota",2020);
        car.showinfo();
    }
}

