package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fetchInputFromFile {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
	    //Instantiate WebDriver with ChromeDriver Object
	  WebDriver  driver = new ChromeDriver();
	   
    driver.get("http://localhost:8080/TestNg-1/index.jsp"); // for our file which is written in webapp
    //Ftech all input Elements from current web page 
    List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
    for(WebElement e : allInputElements)
        System.out.println("Input box id="+e.getAttribute("id"));// <input type="" id="">
    driver.quit();
  }
}
