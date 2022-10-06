package assisted;

import java.util.Scanner;

public class LIS {
	static int max; 
	static int longestIncreasingSubsequence(int arr[], int n)
	{
		
		if (n == 1)
			return 1;

		
		int res, max_ending_here = 1;

		
		for (int i = 1; i < n; i++) {
			res =  longestIncreasingSubsequence(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max < max_ending_here)
			max= max_ending_here;

		
		return max_ending_here;
	}

	
	static int lis(int arr[], int n)
	{
		
		max = 1;

		 longestIncreasingSubsequence(arr, n);

		
		return max;
	}
   
	public static void main(String args[])
	{
		 Scanner sc= new Scanner(System.in);
		
	System.out.println("enter n");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
			
		 }

		
		System.out.println("Length of longest increasing subsequence :  "
						+ lis(arr, n) + "\n");
	}
}
