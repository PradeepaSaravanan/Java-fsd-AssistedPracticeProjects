package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class Test_yahoosignin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://login.yahoo.com/account/create/");
	  WebElement search1= driver.findElement(By.tagName("input"));
	  System.out.println("id's:"+search1.getAttribute("id"));
	  WebElement textfields=driver.findElement(By.name("firstName"));
      System.out.println(" first name id is :" +textfields.getAttribute("id"));
      WebElement textfields1=driver.findElement(By.name("userId"));
      System.out.println(" user id is :" +textfields1.getAttribute("id"));
      WebElement textfields3=driver.findElement(By.name("password"));
      System.out.println("password id is :" +textfields3.getAttribute("id"));
      WebElement textfields4=driver.findElement(By.name("birthYear"));
      System.out.println(" birthyear id is :" +textfields4.getAttribute("id"));
	}

}
