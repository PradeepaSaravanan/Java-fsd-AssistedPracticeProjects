package AssistedProject2;

class Mythread extends Thread
{
	public void run()
	{
		System.out.println("My thread " + this.getId());
	}
}
public class Threadclass {

	public static void main(String[] args) {
		
     Mythread t= new Mythread();
        t.setPriority(4);
     
        t.start();
        	
	}

}
