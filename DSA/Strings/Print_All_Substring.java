public class Print_All_Substring{
    public static void main(String[] args) {
        String t = "6759";
        for (int i =0;i<t.length();i++){
            for(int j=i+1;j<t.length()+1;j++){
                System.out.print(t.substring(i,j)+" ");
            } 
            System.out.println(" ");
    }
    }
}