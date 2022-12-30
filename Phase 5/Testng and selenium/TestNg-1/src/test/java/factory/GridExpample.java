package factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExpample {
    @Test
    public void mailTest() throws MalformedURLException{
        /*DesiredCapabilities are a set of key-value pairs encoded as a JSON object. 
        It helps QAs define basic test requirements such as operating systems, browser combinations, browser versions, etc*/
     DesiredCapabilities cap=new DesiredCapabilities();
     cap.setBrowserName("chrome");
     cap.setPlatform(Platform.WIN10);
     URL url =new URL(" http://192.168.116.226:5566/wd/hub");
    WebDriver driver=new RemoteWebDriver(url,cap);
     driver.get("http://www.google.com");
     System.out.println("Google Title:"+driver.getTitle());
     driver.close();
     
    }

}
