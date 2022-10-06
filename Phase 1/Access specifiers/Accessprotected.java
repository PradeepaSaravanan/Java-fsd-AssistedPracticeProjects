package publicaccess;
 import java.util.Scanner;

import accessspecifiers.Protectedaccess;
public class Accessprotected extends Protectedaccess {
	//public class Accessprotected3 extends proaccessspecifiers {

		public static void main(String[] args) {
			Accessprotected obj = new Accessprotected ();  
			Scanner sc=new Scanner(System.in);
			int x= sc.nextInt();
			int y=sc.nextInt();
		      System.out.println("Result:"+  obj.addition(x,y));
		}


}
