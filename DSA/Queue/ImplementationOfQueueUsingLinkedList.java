class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyQueue {
    Node head;
    Node tail;
    private int  size;
   public  void add(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail =  temp;
        else{
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

   public int remove(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return -1;
        } 
        int n = head.val;
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
        return n;
    }

  public  int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val;
    }
  public  void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

  public void push(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'push'");
  }

  public void pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  public void empty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'empty'");
  }

}

public class ImplementationOfQueueUsingLinkedList{
    public static void main(String[] args) {
    MyQueue mq = new MyQueue();
    mq.add(10);
    mq.add(20);
    mq.add(30);
    mq.add(40);
    mq.add(50);
    mq.add(60);
    mq.display();
    System.out.println(mq.remove());
    System.out.println(mq.peek());
    
    }
}