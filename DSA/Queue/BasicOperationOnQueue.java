import java.util.*;

public class BasicOperationOnQueue{

    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0; i < n; i++){
            System.out.print(q.peek()+ " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void addAtIndex(Queue<Integer> q,int idx,int val){
        if(idx < 0 || idx > q.size()) {
            System.out.println("Invalid Index!");
        }
        int n = q.size();
        if(idx<n){
            for(int i = 1; i <= idx; i++){
                q.add(q.remove());
            }
        }

        q.add(val);
        
        for(int i = 1; i <= n - idx; i++){
            q.add(q.remove());
        }
    }

     public static void peekAtindex(Queue<Integer> q,int idx){

        int n = q.size();
        
        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid Index!");
            return;
        }

            for(int i = 0; i < idx; i++){
                q.add(q.remove());
            }
        System.out.println(q.peek());

        for(int i = 1; i <= n - idx; i++){
            q.add(q.remove());
        }
    }

     public static void removeAtIndex(Queue<Integer> q,int idx){
        int n = q.size();

        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid Index!");
            return;
        }
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }
        
        q.remove();

        for(int i = 0; i <= n - idx - 2; i++){
            q.add(q.remove());
        }
    }

    public static void Reverse(Queue<Integer> q , int k){
        int n = q.size();

        if(k <=0 || k > n){
            System.out.println("Invalid k");
            return;
        }
        Stack<Integer>  st  = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0; i< n-k;i++){
            q.add(q.remove());
        }
    }



    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtIndex(q,2,60);
        display(q);
        peekAtindex(q, 2);
        removeAtIndex(q, 2);
        display(q);
        //System.out.println(q.size());
        Reverse(q,3);
        display(q);

    
        
        
    }
}

