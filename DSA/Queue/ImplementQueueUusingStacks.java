import java.util.*;
class MyQueue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void MyQueue(){

        }

        public void push(int x){ //O(1)
            st.push(x);
        }

        public int pop(){ //O(n)
            while(st.size()>1){
                helper.push(st.pop());
            }
            int front = st.pop();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return front;
        }

        public int peek(){ //O(n)
            while(st.size()>1){
                helper.push(st.pop());
            }
            int front = st.peek();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return front;
        }

        public boolean empty(){
            return (st.size()==0);
        }

}


public class ImplementQueueUusingStacks {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(10);
        mq.push(20);
        mq.push(30);
        mq.push(40);
        mq.push(50);
        mq.pop();
        mq.peek();
        mq.empty();
        
    }
}