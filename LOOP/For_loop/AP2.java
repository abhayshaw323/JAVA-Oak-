import java.util.Scanner; 
public class AP2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =3, d = 4;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            a += d;
        }
    }
}



