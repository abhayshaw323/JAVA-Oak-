class employee{
    void salary(){
        System.out.println("Salary = 700000");
    }
}

class hr extends employee{
    void bonus(){
        System.out.println("bonus = 200000");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        
        hr obj = new hr();
        obj.salary();
        obj.bonus();
    }
    
}
