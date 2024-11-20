

public class LinkedList {
	
	//Define our own data type "node": containing data and address of next node.
	public static class Node{
		int data;
		Node next;   // will contain address of next node to link the list .
		
		
	    Node(int val) {     //constructor
			this.data=val;
			this.next=null;
		}
		
		Node(){
		}
		
		
	}
	
	Node head;
	//Node tail;
	int size=0;
	
	public void addFirst(int val) {
		Node newnNode=new Node();
		newnNode.data=val;      // putting val into data.
		newnNode.next=head;     // helps in linking.
		head=newnNode;
		//tail=newnNode; 
		size++;
	}
	
	public void display(Node head) {
		Node temp=head;    //to not loose the previous head.
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	

	public static void main(String[] args) {
		LinkedList ll=new LinkedList() ;
		ll.addFirst(10);
		ll.addFirst(11);
		ll.addFirst(15);
		ll.addFirst(19);
		
		
		ll.display(ll.head);
		
	}
	

}
