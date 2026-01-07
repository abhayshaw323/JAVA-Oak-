class Dog{
    String name;
    int license_id;


public void eat(){
    System.out.println(name+" eats!");
}
}
public class Object {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.eat();
    }
}
