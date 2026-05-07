class ListNode{
	int val;
	ListNode next;
	ListNode prev;
	ListNode(int val){
		this.val = val;
	}
}

class DLL{
	ListNode head;
	ListNode tail;
	int size; 
	int idx;
	void insertAtHead(int val){
		ListNode temp = new ListNode(val);
		if(head == null) head = tail = temp;
		else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		size++;
	}

	void insertAtTail(int val){
		ListNode temp = new ListNode(val);
		if(head == null) head = tail = temp;
		else{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
		size++;
	}

	void deleteAtHead(){
		if(size==0){
			System.out.println("List is empty!");
			return;
		}
		if(size==1) head =tail = null;
		else{
			head = head.next;
			head.prev = null;
		}
		size--;
	}

	void deleteAttail(){
		if(size==0){
			System.out.println("List is empty!");
			return;
		}
		if(size==1) head =tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
	}

	void insert(int idx, int val){
		if(idx<0 || idx>size){
			System.out.println("Invalid index!"); 
			return;
		}
		if(idx == 0 ) {
			insertAtHead(val);
			return;
		}

		if(idx == size ) {
			insertAtTail(val);
			return;
		}

		ListNode a = new ListNode(val);
		ListNode temp = head;
		for(int i=0;i<idx;i++){
			temp = temp.next;
		}
		a.prev = temp;
		a.next = temp.next;
		temp.next = a;
		a.next.prev = a;
		size++;
	}

	void display(){
		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.val+" ");
			temp =  temp.next;
		}
		System.out.println();
	}
	
	void displayReverse(){
		ListNode temp = tail;
		while(temp != null){
			System.out.print(temp.val+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
}


public class DoublyLinkedList{
	public static void main(String[] args){
		DLL list = new DLL();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		list.insertAtTail(1);
		list.display();
		list.deleteAtHead();
		list.deleteAttail();
		list.display();
		System.out.println(list.size);
		list.displayReverse();
		list.insert(4, 35);
	}
}
