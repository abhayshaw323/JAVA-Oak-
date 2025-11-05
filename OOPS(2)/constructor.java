class Student{ // class cretion
    int id;
    int age;
    
    Student(int id,int age ){
        this.id = id ;
        this.age = age;
        System.out.println("Parametrized Constructor");
    }

    Student(){       // -> constructor
        System.out.println("Default Constructor");
    }
}
    public class constructor {
        public static void main(String[] args) {
            Student s1 = new Student(); // object creation
        }
}
