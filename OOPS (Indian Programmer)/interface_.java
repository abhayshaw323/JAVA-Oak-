interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel car starts");
    }
}

public class interface_ {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        Car XUV700 = new DieselCar();
        tesla.start();
        XUV700.start();      
    }
    
}
