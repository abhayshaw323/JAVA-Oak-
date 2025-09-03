//Example 3 – Encapsulation with Getters and Setters
//Problem Statement: Create a class Student with private attributes and provide public getters and setters

public class person {
    //private attributes for encapsulation
    private String name;
    private int age;
    //Constructor
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int a )
    {
        this.age = a;
    }

       public static void main(String[] args)
    {
        person p1 = new person();
        // p1.name = "Mark";
        // p1.age = 20;

        p1.setName("Mark");
        p1.setAge(20);

        System.out.println("Name is "+p1.getName());
        System.out.println("Age is "+p1.getAge());
    }

}

