package Exp;
class Calculation{
	public void Add(int n,int m)
	{
		System.out.println("Addition"+(n+m));
	}
	public void Subtract(int n,int m)
	{
		System.out.println("Subtraction: "+(n-m));
	}
}
class myCal extends Calculation
{
	public void totalValue(int n, int m)
	{
		System.out.println("total value: "+(2+m*n));
	}
}
public class Inheritance {

	public static void main(String[] args) {
		myCal m= new myCal();
		m.Add(23, 2);
		m.Subtract(67, 12);
		m.totalValue(23, 98);

	}

}
