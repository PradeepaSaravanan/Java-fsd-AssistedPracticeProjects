package accessspecifiers;

public class Privatespecifier {

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		Accessprivate  p = new Accessprivate (); 
        //trying to access private method of another class 
       p.display();

	}

}
class Accessprivate 
{ 
   private void display() 
    { 
        System.out.println("Example of private access Specifier"); 
    } 
} 

