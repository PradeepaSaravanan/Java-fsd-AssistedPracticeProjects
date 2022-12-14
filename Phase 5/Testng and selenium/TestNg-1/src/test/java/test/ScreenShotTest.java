package test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	  WebDriver  driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	     
      //xpath=//tagname[@Attribute='value]
      // //--> current node
      
      
      WebElement upload = driver.findElement(By.xpath("//*[@type='text']"));
      upload.click();
      TakesScreenshot ts = (TakesScreenshot)driver;
      File scr = ts.getScreenshotAs(OutputType.FILE);
      try {
		FileUtils.copyFile(scr, new File("test.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	  /*driver.get("https://www.flipkart.com/");
	  WebElement upload= driver.findElement(By.xpath("//*[@type='text']"));
	  upload.click();
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  try {
		  FileUtils.copyFile(src, new File("test.png"));
	  }catch(IOException e){
		  e.printStackTrace();
		  
	  }
	  */
  }
}
