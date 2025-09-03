public class math {
    public static void main(String[] args) {
       // System.out.println(Math.max(5,9));
       int mx1 = Math.max(3,5);
       int mx2 = Math.max(mx1,7);
       int mx3 = Math.max(mx2,2);
       System.out.println(mx3);

       int max_val = Math.max(Math.max(Math.max(3,5),7),9);

       int max_val2 = Math.max( (Math.max(4,5)) , (Math.max(8,9)) );

       System.out.println(max_val);
       System.out.println(max_val2);

       System.out.println(Math.sqrt(25));

       System.out.println(Math.random());

       System.out.println(Math.abs(-4.5));
       System.out.println(Math.abs(4.5));
    }
    
}
