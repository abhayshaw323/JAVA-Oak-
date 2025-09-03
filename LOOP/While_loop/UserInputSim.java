public class UserInputSim {
    public static void main(String[] args) {
        int attempt = 0;
        boolean isLoggedIn = false;
        while(!isLoggedIn && attempt <3) {
            attempt++;
        }
        System.out.println("Login attempts: "+ attempt);
    }
    
}
