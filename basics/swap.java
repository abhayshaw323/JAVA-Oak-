public class swap {
    public static void main(String[] args) {
        int a = 5 ,b = 7;
        a = a + b;
        b = a - b;
        a = a - b;

        // a = 2;
        // b = 5;
        // temp = a;
        // a = b;
        // b = temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    
}
