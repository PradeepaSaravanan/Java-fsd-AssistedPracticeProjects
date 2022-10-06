package Assisted;

public class Innerclass {
 private String msg="Welcome to Home"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Have a plesant day");}  
	 }  


	public static void main(String[] args) {

		Innerclass obj=new Innerclass();
		Innerclass.Inner in=obj.new Inner();  
		in.hello();  
	}

}
