package test;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class NewTestF {
	WebDriver driver;

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
       driver = new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);

		
		//give condition to Fluentwait for seraching an element. Function is an interface and override apply()
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver t) {
				
				//WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
				/*String getTextOnPage = element.getText();
				if (getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(getTextOnPage);
					return element;
				} else {
					System.out.println("FluentWait Failed");
					return null;
				}*/
				
				WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
				if(element==null) {
					System.out.println("Element not found");
					return null;
				}
				else
					return element;
				
				
			}
			
			
			
			
		});
		}

}
