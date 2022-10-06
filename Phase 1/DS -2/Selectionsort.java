package datastructure;

import java.util.Scanner;

public class Selectionsort {

	public static void Sort(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{ int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			int temp=arr[min_index];
			arr[min_index]= arr[i];
			arr[i]= temp;
		}
	}
	
	public static void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Array Before sorting");
		display(arr,n);
		Sort(arr,n);
		System.out.println("Array after sorting");
		display(arr,n);
	}

}
