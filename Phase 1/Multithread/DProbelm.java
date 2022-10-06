package Exp;
interface One
{
	default void display()
	{
		System.out.println("First interface");
	}
}
interface Two
{
	default void display()
	{
		System.out.println("Second interface");
	}
}
public class DProbelm implements One, Two {

	public static void main(String[] args) {
		DProbelm dp= new DProbelm();
		dp.display();
	}

	@Override
	public void display() {
		Two.super.display();
		One.super.display();
	}

}
