package pkg10;

public class Authentication {
	
	//String username="Anuchitra";
	//String password="2018506018";
	public boolean Validate(String username, String Password)
	{
		if(username.equals("Anuchitra") && Password.equals("20185060")) {
			System.out.println("Validated successfully");
			return true;
		}
		
		else {
			System.out.println("Username and password doesn't match");
		    return false;
		}
	}

}