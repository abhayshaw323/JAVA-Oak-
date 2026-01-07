public class A{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        A obj_a = new A();
       // int res = obj_a.add(5,5);
        System.out.println(add(5,5));
        System.out.println(mul(4,3));
    }
}