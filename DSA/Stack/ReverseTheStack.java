import java.util.Stack;

public class ReverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);// bottom
        st.push(20);
        st.push(30);
        st.push(40);// top
        int element = 50;
        System.out.println(st);
        pushAtBottom(st,element);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
private static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
private static void pushAtBottom(Stack<Integer> st, int element) {
        if(st.size()==0){
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, element);
        st.push(top);
    }   
}
