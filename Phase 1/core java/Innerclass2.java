package Assisted;
class Outer{
	class Inner{
		public void show()
		{
			System.out.println("Innerclass created");
		}
	}
}
public class Innerclass2 {
public static void main(String [] args)
{
	Outer.Inner in= new Outer().new Inner();
	in.show();
}
}
