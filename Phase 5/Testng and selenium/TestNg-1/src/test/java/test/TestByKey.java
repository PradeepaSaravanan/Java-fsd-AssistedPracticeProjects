package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestByKey {
 WebDriver driver;
	@Test
  public void f() {
		//driver.get("http://mail.google.com/");
	 driver.get("http://login.yahoo.com/");
	 driver.findElement(By.id("login-username")).sendKeys("nidhikhandelwal09@yahoo.in");
	 WebElement searchIcon= driver.findElement(By.id("login-signin"));
	 searchIcon.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	   driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
