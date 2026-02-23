import java.util.*;
public class halfPyramidWithNumber {
    public static void inverted_rotated_half_pyramid_withNumber(int n){
        int count = 1;
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(count+" ");
                count++;            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid_withNumber(5);
    }
}