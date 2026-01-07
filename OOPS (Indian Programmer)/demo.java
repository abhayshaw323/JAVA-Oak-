class student{
    String name;
    int roll_no;
    String addresss;
}
public class demo {
    public static void main(String[] args) {
        student std1 = new student();
        std1.name = "Raman";
        System.out.println(std1.name);
        std1.name = "rahul";
        System.out.println(std1.name);
        student std2 = new student();
        std2.name = "rhau";
        System.out.println(std2.name);

    }
}