package Assisted;
import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Dharmapuri");//
	      city.add("Chennai");  
	      city.add("Dindugal");  
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> v = new Vector();
	      v.addElement(15); 
	      v.addElement(30); 
	      v.addElement(50);
	      System.out.println(v);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> birds=new LinkedList<String>();  
	      birds.add("Dove");  
	      birds.add("Sparrow"); 
	      birds.add("Peacock"); 
	      //System.out.println(birds);
	   Iterator<String> itr=birds.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	             
	       System.out.println(set2);
	      

	}
	}
}
