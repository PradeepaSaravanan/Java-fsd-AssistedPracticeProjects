package datastructure1;

import java.io.*;

public class DoublyLinkedList {
	static Node head;
	class Node
	{
		int data;
		Node next,prev;
		public Node(int data)
		{
			prev=null;
			this.data=data;
			next=null;
		}
	}
	public static DoublyLinkedList insert(DoublyLinkedList l, int data)
	{
		Node new_node = l.new Node(data);
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
			  new_node.prev=last;
			
	
		}
		return l;
		
	}
	public static void PrintList(DoublyLinkedList l)
	{
		Node curr=l.head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static void PrintReverse(DoublyLinkedList l)
	{
		Node last = l.head;
		System.out.print("Reverse LinkedList: ");
		// Traverse through the LinkedList and stops at end node
		for (last=l.head;last.next != null;last = last.next) {}


		for (;last != null;last = last.prev) {
			// Print the data at current node
			System.out.print(last.data + " ");
			// Go to next node
			
		}

	}
	
	public static void main(String[] args) {
		DoublyLinkedList l= new DoublyLinkedList();
		l.insert(l,34);
		l.insert(l,2);
		l.insert(l,4);
		l.insert(l,17);
		l.PrintList(l);
		l.PrintReverse(l);
		
		
	

	}

}
