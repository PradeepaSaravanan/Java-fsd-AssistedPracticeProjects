package assisted;
class RotateArray { 
public void rotate(int[] arr, int k) {
    		if(k > arr.length) 
       			k=k%arr.length;
 		int[] result = new int[arr.length];
 		for(int i=0; i < k; i++){
        			result[i] = arr[arr.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<arr.length; i++){
        			result[i] = arr[j];
j++;
    		}
 		System.arraycopy( result, 0, arr, 0, arr.length );
}
} 

public class ArrayRotation {

	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int arr[] = { 50,60,34,56,52,8}; 
		r.rotate(arr, 5); 
		for(int i=0;i<arr.length;i++){
    			System.out.print(arr[i]+" ");
		}


	}

}
