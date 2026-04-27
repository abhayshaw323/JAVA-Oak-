class Node{
    int val; // Default value "null".
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class NodesOfLinkedList{
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
        System.out.println(a.next.next.next.next.next);
        System.out.println(b.next.next.val);
    }
}