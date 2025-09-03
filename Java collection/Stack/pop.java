import java.util.Stack;
public class pop {
    public static void main(String[] args) {
        Stack<String> Subject_names = new  Stack<>();
        Subject_names.push("Software Engineering");
        Subject_names.push("Compiler Design");
        Subject_names.push("Operating System");
        Subject_names.push("OOPS");
        Subject_names.push("Industrial management");
        Subject_names.push("Artifical Intelligence");

        System.out.println(Subject_names);

        String top = Subject_names.pop();
        System.out.println(Subject_names);
    }
}
