package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {


		  System.setProperty("webdriver.chrome.driver",
		            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://gmail.com");

		driver.manage().window().maximize();
		
	}

	@Test
	public void test() throws InterruptedException {
//saving the GUI element reference into a "element" variable of WebElement type
		WebElement element = driver.findElement(By.id("Email"));

		element.sendKeys("pradee23999@gmail.com");
		element.sendKeys(Keys.RETURN);

		driver.findElement(By.id("Passwd")).sendKeys("Pradeepa@2309");

		driver.findElement(By.id("signIn")).click();
//explicit wait - to wait for the compose button to be click-able

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}
}
