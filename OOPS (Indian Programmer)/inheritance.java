class parentclass{
    void display(){
        System.out.println("Parent class method");
    }
}

class childclass extends parentclass{
    void show(){
        System.out.println("Child class method");
    }
}
public class inheritance {
    public static void main(String[] args) {
        childclass child1 = new childclass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
