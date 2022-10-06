package assisted;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	 public static void main(String[] args)
	 {
		Queue<String> student = new LinkedList<>();
	                 	student.add("Ramya");
		        		student .add("Divya");
		        		student.add("Losshika");
		        		student.add("Sivaram");
		        		student.add("Rajesh");
		        		student.add("Vishwa");
		        		student.add("Udhai");
		                System.out.println("Queue is : " +student);
		        		System.out.println("Head of Queue : " + student.peek());
		        		System.out.println("Size of Queue : " + student.size());
		        		student.remove();
		        		student.remove();
		        		System.out.println("After removing names  of Queue : " + student);
		        		System.out.println("Size of Queue : " + student.size());
		    	}

}
