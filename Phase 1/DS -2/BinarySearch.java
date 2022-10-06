package datastructure;



import java.util.Scanner;

public class BinarySearch {

/*	public static boolean BS(int arr[] , int key)
	{
		//key=sc.nextInt();
		boolean flag=false;
		int start=0;
		int end=arr.length;
		int mid;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(arr[mid]==key)
			{
				flag=true;
				break;
			}
			else
			{
			if(arr[mid]<key) start=mid+1;
			else end=mid-1;
				
			}
			
		}
		return flag;
		
	}*/
	/*public static void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}*/
	public static int  RecBS(int arr[],int key,int left, int right)
	{
		if(left<=right)
		{
			int mid= left+(right-left)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else
			{
				if(arr[mid]<key)
				{
					return  RecBS(arr,key, left, mid-1);
				}
				else
				{
					return RecBS(arr, key, mid+1, right);
				}
			}
		}
		return -1;
		
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
    Selectionsort.Sort(arr,n);
  
      System.out.println("Enter key to searck: ");
      int key=sc.nextInt();
      int res=RecBS(arr,key,0,n-1);
      if(res==-1)
    	  {
    	  System.out.println("key "+key+" is found");
    	  }
      else
    	  System.out.println("key "+key+" is not found");
      }

}

