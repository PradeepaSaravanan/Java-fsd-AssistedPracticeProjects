package Exp;

public class Polymorphism {

	
	public int sum(int num)
	{
		return (num+num);
		
	}
	public int sum(int a, int b) {
		return (a+b);
	}
	public double sum(double a, double b)
	{
		return (a+b);
	}
	public static void main(String[] args) {
		Polymorphism p= new Polymorphism();
		System.out.println("One parameter: "+p.sum(34));
		System.out.println("same type parameter: " +p.sum(34,34));
		System.out.println("Different parameter: "+p.sum(34.0,34.0));

	}

}
