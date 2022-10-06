package assisted;



public class SingleLinkedList {

	  public static Node head;
	
	static class Node {
		int data;
		Node next;
		public Object head;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static SingleLinkedList insert(SingleLinkedList l, int data)
	{
		Node new_node = new Node(data);
		if (l.head==null)
		{
			l.head=new_node;
		}
		else 
		{
			Node last;
		
			for( last=l.head; last.next!=null; last=last.next)
			{}
			  last.next=new_node;	
			
	
		}
		return l;
		
	}
	
	
	public static SingleLinkedList delkey(SingleLinkedList l, int key)
	{
	//LinkedList curr=l;
		Node curr=l.head;
		Node prev=null;
		if(curr!=null && curr.data==key)
		{
			l.head=curr.next;
			System.out.println(key+" found and deleted");
		//curr=curr.next;
			
		}
		else
		{
			while(curr!=null &&curr.data!=key)
			{
				prev=curr;
				curr=curr.next;
			}
	
		if(curr!=null)
		{
			prev.next=curr.next;
			System.out.println(key+ " found and deleted" );
		}
		
		if(curr==null) System.out.println(key+" not found");
		
		}
		return l;
		
	}
	public static void Print(SingleLinkedList l)
	{
		Node curr=head;
		if(curr==null)
		{
			System.out.println("Empty lsit");
		}
		while(curr!=null)
		{
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
			SingleLinkedList l = new SingleLinkedList();
		l= insert(l, 23);
		l= insert(l, 24);
		l= insert(l, 29);
		l= insert(l, 20);
		l= insert(l, 2);
		l= insert(l, 12);
		l.Print(l);
		l=delkey(l,23);
		l=delkey(l,2);
		l=delkey(l,56);
		l.Print(l);
	}
	
}
