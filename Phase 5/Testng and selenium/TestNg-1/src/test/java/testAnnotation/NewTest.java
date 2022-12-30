package testAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.edge.driver",
			  "C:\\Users\\Pradeepa saravanan\\Downloads\\edgedriver_win64/msedgedriver.exe");
	           // "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	  WebDriver  driver = new EdgeDriver();
	  driver.get("https://www.flipkart.com/");
  }
}
