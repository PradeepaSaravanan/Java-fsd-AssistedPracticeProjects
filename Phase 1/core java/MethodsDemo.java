package Assisted;
import java.util.*;
public class MethodsDemo {
	 public static void main( String[] args)
     {
    	 Scanner sc = new Scanner (System.in);
    	System.out.println("Enter numbers:");
    		int x= sc.nextInt();
    		int y= sc.nextInt();
    	differntmethods obj = new differntmethods();
    	obj.sum(x,y);
    	obj.sum(y);
    	System.out.println(obj.compare(x, y));
    	System.out.println(obj.equals(x, y));
    	 
     }
}
class differntmethods{
	
	 public void sum(int n,int m)
	 {
		int result=0;
		result= n+m;
		System.out.println(" void type: "+ result);
	 }
	 public void sum(int n)
	 {
		 int res=0;
		 res=(2*n)+n;
		 System.out.println("method overloading: "+res);
	 }
	 public int compare(int a, int b)
	 {
		 if(a>b) return a;
		 else return b;
	 }
	 public boolean equals(int u, int v) {
		 if(u==v) return true;
		 else return false;
	 }
}
