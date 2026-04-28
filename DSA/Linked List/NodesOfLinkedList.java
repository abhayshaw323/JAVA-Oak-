class Node{
    int val; // Default value "null".
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class NodesOfLinkedList{

    public static void get(Node head , int idx){
        int i = idx ;
        Node temp = head;
        while(i > 0){
            temp = temp.next;
            i--;
        }
        System.out.println(temp.val);
    }

    public static void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
        System.out.println(head.val + " ");
    } //if we interchange the line 14 and 15 then the output will be in the present order else it will be the reverse of the present order 


    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        //10->20->30->40->50 
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40);
        Node e = new Node(50);
        // connnect karenge  (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);
        System.out.println(".....................................");
        displayRec(a);
        System.out.println(".....................................");
        get(a, 2);
        System.out.println(".....................................");
        System.out.println(a.next.next.next.next.next);
        System.out.println(b.next.next.val);
    }
}