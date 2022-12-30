package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\Pradeepa saravanan\\Downloads\\chromedriver_win32/chromedriver.exe");
    //Instantiate WebDriver with ChromeDriver Object
  WebDriver  driver = new ChromeDriver();
  //get() use to open a particular url
  driver.get("http://www.ebay.com/"); //https://login.yahoo.com
//  System.out.println("The title of the page is :" + driver.getTitle());*/ 
 //driver.get("http://login.yahoo.com/"); //https://login.yahoo.com
 System.out.println("The title of the page is :" + driver.getTitle());
 
  WebElement ele= driver.findElement(By.id("gh-ac-box"));
  System.out.println("Element info:"+ele.getTagName());
  
}
}
