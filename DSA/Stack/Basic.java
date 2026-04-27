import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");

        System.out.println(st.size());
        System.out.println(st);  // A.S. = O(n)
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}


