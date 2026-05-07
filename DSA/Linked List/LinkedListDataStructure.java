class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;


    void addAtHead(int val) { // T.C. - O(1)
        Node temp = new Node(val);// Creating a temp node 
        if (head == null) head = tail = temp; // empty Linked List
        else{
            temp.next = head;
            head = temp;
        } 
        size++;
    }

    
    void addAtTail(int val){ // T.C. - O(1)
        Node temp = new Node(val); //Creating a temp node 
        if(head == null) head = tail = temp;// empty  linked  list 
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;   
    }



    void addAtIndex(int idx , int val){ // T.C. - O(n)
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index!");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else {
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++; 
        }   
    }


    
    
    void deleteAtHead() { // T.C. - O(1)
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head==null) tail = null;
        size--;
    }

    void deleteAtIndex(int idx){ // T.C. - O(n)
            if(idx < 0 || idx >= size ){
                System.out.println("Invalid Index");
                return;
            }
            if(idx==0) deleteAtHead();
            else {
                Node temp = head;
                for(int i=1;i<=idx;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next; // delete
                size--;
                if(idx == size-1) tail = temp;
            }

    }
    
    boolean search(int val){
        if(head == null ) return false;
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return true;
            }
            else {
             temp = temp.next;
            }
        }
        return false;
    }



    
    void display(){ // T.C. - O(n)
        if(head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    void get(int idx){ // T.C. - O(n)
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
}




public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtHead(5);
        ll.addAtHead(4);
        ll.addAtHead(3);
        ll.addAtHead(2);
        ll.addAtHead(1);
        ll.addAtIndex(8,35);
        //System.out.println(ll.search(1));
        //ll.deleteAtHead();
        System.out.println("Displaying the values of linked list");
        ll.display();
        System.out.println("Getting the value at the given index");
        ll.get(8);
        System.out.println("Printing the size of Linked List " + ll.size);
        ll.deleteAtIndex(5);         
        System.out.println("Printing the size of Linked List " + ll.size);
    
    }
} 