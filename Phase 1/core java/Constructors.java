package Assisted;

public class Constructors {
	public static void main (String[] args)
	{
		demo d= new demo();
		//System.out.println);
		System.out.println(" Name: "+ d.name +" id: "+ d.id );
		demo d1= new demo("pradeepa", 3050, "CT");
		System.out.println(" Name: "+ d1.stud_name +" Registerr no: "+ d1.regno + " Department: "+ d1.dept );
	}
	}
	class demo{
		String name;
		int id;
		String stud_name;
		int regno;
		String dept;
		
		demo()
		{
			System.out.println(" constructor called");
			this.name =name ;
			this.id=id;
			
		}
		demo(String stud_name, int regno, String dept)
		{
			this.stud_name=stud_name;
			this.regno= regno;
			this.dept= dept;
		}
		
}
