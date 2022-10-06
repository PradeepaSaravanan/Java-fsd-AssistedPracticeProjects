package test10;

public class Authentication {

	public boolean Validate(String username, String Password)
	{
		if(username.equals("Pradeepa") && Password.equals("1234")) {
			System.out.println("Validated Successfully");
		return true;
		}
		else
			{
			System.out.println("Username and password doesn't match");
			return false;
			}
	}

}
