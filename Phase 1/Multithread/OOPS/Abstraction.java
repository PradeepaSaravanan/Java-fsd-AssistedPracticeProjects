package Exp;
abstract class Shape
{
	String color;
	abstract double area();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class Circle extends Shape
{
 
		private double radius;
		public Circle(double radius)
        {
		//super(color);
        	this.radius=radius;
        }
	@Override
	double area() {
		return Math.PI*radius*radius;
	}
	
	public void StringtoString(double radius)
	{
		System.out.println("Area od circle: "+ area());
	}
}
public class Abstraction {

	public static void main(String[] args) {
	
		Circle c= new Circle(5);
		c.StringtoString(5);
		
	}

}
