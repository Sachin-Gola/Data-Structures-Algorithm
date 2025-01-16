

public class MyLinkedList {
	public static class Node{
		int data;  //value
		Node next; // address of next node
		Node(int data){
			this.data=data;
		}
		
	}
	
	public void displayLL(Node head) {
		Node temp=head; // we don't want to lose head, hence temp used.
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public int sizeLL(Node head) {
		int count=0;
		Node temp=head; // we don't want to lose head, hence temp used.
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	
   public static void main(String[] args) {
	   MyLinkedList ll =new MyLinkedList();
	   Node node1 =new Node(5);  // creating a new node , here head node.
	   Node node2 =new Node(4);
	   Node node3 =new Node(8);
	   Node node4 =new Node(9);
	   Node node5 =new Node(7);
	
	  // For linking all the nodes.
	  node1.next=node2;
	  node2.next=node3;
	  node3.next=node4;
	  node4.next=node5;
	  ll.displayLL(node1);
	  System.out.println();
	  System.out.println(ll.sizeLL(node1));
	
    
	
   }
}
