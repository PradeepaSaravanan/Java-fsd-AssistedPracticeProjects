package Assisted;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		int b[][] = new int[2][2];
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter elements for 1D array");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
			// System.out.println(arr[i]);
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 //arr[i]=sc.nextInt();
			 System.out.println(arr[i]);
		 }
		 System.out.println("Enter elements for 2D array");
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 b[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 //b[i][j]=sc.nextInt();
				 System.out.println(b[i][j]);
			 }
		 }

		//System.out.println("Length of the array:"+arr.length);
		
		
	}
}
