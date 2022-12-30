package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	  WebDriver  driver = new ChromeDriver();
	  //get() use to open a particular url
	  driver.get("http://flipkart.com/");
	  System.out.println("The title of the page is :" + driver.getTitle());
	  WebElement searchTitle= driver.findElement(By.name("q"));
	  System.out.println( "Search title:"+ searchTitle.getAttribute("title"));
	  System.out.println( "Search placeholder:"+ searchTitle.getAttribute("placeholder"));
	  System.out.println( "Search autocomplete:"+ searchTitle.getAttribute("autocomplete"));
	  
	}

}
