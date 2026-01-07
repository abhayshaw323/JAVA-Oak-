class yest{
    String a ="Abhay Shaw";
    int rollno = 123015;
    void show(){
        System.out.println("Name:-"+a+", roll_no " +rollno);
    }
}
public class object_creation {
    public static void main(String[] args) {
        yest college = new yest();
        college.show();
    }
}
