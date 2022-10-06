package Assisted;
import java.io.*;
import java.util.*;
import java.util.*;
public class typecasting {
	public static void main( String [] args)
	 {
		 Scanner sc= new Scanner(System.in);
		//int x; 
		char v='f';
		int x=v;
		
		double y=v;
		
		System.out.println(" Implicit declaration\n "+"Char:"+ v +"\n int "+ x+" \ndouble: "+y);
		
		
		int a=10;
		double c= (double)a;
		
		
		
		double f= 2.3;
		int u=(int)f;
		System.out.println("Explicit Declaration:\n"+ "Double :"+c +" \nint: "+u);
		//System.out.println("Explicit:"+t+ " float: "+ f );
		
	 }
}
