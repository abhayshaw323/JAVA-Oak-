public class ClassAndObject{

    public static class Student {       //-> Class
    String name;
    int rollno;
    double percent;


public void printdata(){
    System.out.println(name);
    System.out.println(rollno);
    System.out.println(percent);
}
    }
public static void main(String[] args){
    Student s1 = new Student();          //-> Object creation
    s1.name = "Raghav";
    s1.rollno = 76;
    s1.percent = 92.5;

    Student s2 = new Student();
    s2.name = "Abhay";
    s2.rollno = 25;
    s2.percent = 85.3;

    s1.printdata();
    s2.printdata();
}
}

