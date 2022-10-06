package AssistedProject2;
class MyNewThread implements Runnable{
	public void run()
	{
		System.out.println("Runnable Thread");
	}
}
public class Runnable {
 public static void main(String []args)
 {
	 System.out.println("main method");
	// Mythread thread2= new Mythread();

	// Thread b= new Thread(thread2);
	 Thread t= new Thread( new MyNewThread());
	 t.start();
 }
}
