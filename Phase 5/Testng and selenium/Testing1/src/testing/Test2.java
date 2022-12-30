package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
		            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
		    //Instantiate WebDriver with ChromeDriver Object
		  WebDriver  driver = new ChromeDriver();
		  //get() use to open a particular url
		  driver.get("http://login.yahoo.com/"); //https://login.yahoo.com
		  WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
		 // WebElement searchIcon = driver.findElement(By.name("signin"));
		    searchIcon.click();
		System.out.println(searchIcon.getAttribute("value"));
		  WebElement textfields=driver.findElement(By.tagName("input"));
		  System.out.println(textfields.getAttribute("class"));


	}

}
