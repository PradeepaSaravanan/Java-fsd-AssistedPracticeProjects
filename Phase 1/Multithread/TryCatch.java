package AssistedProject2;

public class TryCatch {

	public static void main(String[] args) {
		
        try {
        	System.out.println(5/0);
        }catch (ArithmeticException e)
        {
        	e.printStackTrace();
        }
	}

}
