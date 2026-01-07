import java.io.IOException;
public class GP {
    public static void main(String[] args)throws IOException{

        int n = 10;
        int a = 3, b = 4;

        for (int i = 0; i < n; i++) {
             System.out.write((a + " ").getBytes());

            a *=b;
        }
        System.out.flush();
    }    
}
