public class Sum_Of_All_Substring {
    public static void main(String[] args) {
        String s  = "6759";
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub = s.substring(i, j);
                sum = sum + Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
