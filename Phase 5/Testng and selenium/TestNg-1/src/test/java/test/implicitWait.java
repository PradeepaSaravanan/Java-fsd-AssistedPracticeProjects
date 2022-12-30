package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class implicitWait {
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;
	
	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl);
		element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium WebDriver Interview questions");
		element.sendKeys(Keys.RETURN);
		List<WebElement> list = driver.findElements(By.className("_Rm"));
		System.out.println("list size="+list.size());

	}
  @SuppressWarnings("deprecation")
  @BeforeMethod
  public void setUp() throws Exception {
		
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	  
	  driver = new ChromeDriver();
		baseUrl = "http://www.google.com";
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

  @AfterMethod
  public void tearDown() throws Exception {
		driver.quit();
	}
}
