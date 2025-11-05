public class abha {
    public static void main(String[] args) {
        String str = "ABcdeF";
        char[] arr = str.toCharArray();
        int len = arr.length;
        char[] reversed = new char[len];

        for(int i=0;i<len;i++){
            char c = arr[len - 1 -i];
            if(Character.isLowerCase(c)){
                reversed[i] = Character.toUpperCase(c);
            }else{
                reversed[i] = Character.toLowerCase(c);
            }
        }
        System.out.println("Original string:" + str);
        System.out.println("Reversed String with toggled case:" + new String(reversed));
    }
    
}
