package datastructure;

import java.util.Scanner;

public class BubbleSort {

	
	public static void bubble(int arr[],int n)
	{
		int temp;
		
		boolean flag;
		for(int i=0;i<n-1;i++)
		{ 
			 flag = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				
			}
			if(flag==false)
				break;
		}
	}
	static void print(int arr[], int n)
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
		print(arr,n);
		bubble(arr,n);
		System.out.println("Array after sorting");
		print(arr,n);
	}

}
