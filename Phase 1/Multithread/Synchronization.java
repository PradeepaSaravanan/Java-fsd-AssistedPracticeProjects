package Thread;

class Board{
	synchronized void printTbale(int n)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Mthread1 extends Thread{
	Board t;
	Mthread1( Board t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTbale(5);
	}
}
class Mthread2 extends Thread{
	Board t;
	Mthread2( Board t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTbale(100);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		Board b= new Board();
		Mthread1 t1= new Mthread1(b);
		Mthread2 t2= new Mthread2(b);
		
		t1.start();
		t2.start();
	

	}

}
