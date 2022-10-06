package Exp;

public class ExpHandling {

	static void Info() throws ArrayIndexOutOfBoundsException,NumberFormatException{
		int arr[]= {23,45};
		System.out.println(arr[4]);
		int num=Integer.parseInt("Abi");
	}
	public static void main(String []args) {
		try {
			System.out.println("No error in program,");
			Info();
		}catch(ArrayIndexOutOfBoundsException|NumberFormatException e)
		{
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}
}
