package AssistedProject2;

public class SleepWait {
    private static Object LOCK = new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);
        System.out.println( Thread.currentThread().getName() +"Thread is in sleep for 1000ms");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "is exceuted after 1000ms");
        }

	}

}
