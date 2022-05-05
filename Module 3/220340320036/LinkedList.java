import java.util.*;

class LinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	
	void insert(int d){
		if(head==null){
			head=new Node(d);
			return;
		}
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new Node(d);
	}
	
	void display(Node n){
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	void reverse(Node n){
		Node prev=null;
		Node current=n;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=num; i++){
			LinkedList list=new LinkedList();
			int n=sc.nextInt();
			for(int j=0; j<n; j++){
				list.insert(sc.nextInt());
			}
			list.reverse(list.head);
			list.display(list.head);
		}
	}
}