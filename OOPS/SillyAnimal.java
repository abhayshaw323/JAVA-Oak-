public class SillyAnimal{
    //instance variable 
    String type;
    int age;
    //Method to display details
    public void displayinfo(){
        System.out.println("Type " +type + " Age " + age);
    }
    public static void main(String[] args){
        //creating an object of sily animal.
        SillyAnimal a = new SillyAnimal();
        a.type = "cat";
        a.age = 3;
        a.displayinfo();
    }
}