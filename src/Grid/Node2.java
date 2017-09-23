package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  String nodeUrl;
	  try{
		  	nodeUrl = "http://192.168.99.100:4444/wd/hub";
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("https://www.edureka.co/");
	        Thread.sleep(5000);
	        System.out.println("Title is " +driver.getTitle());
	  }catch(MalformedURLException e)
	  {
		  e.printStackTrace();
	  }
  }
}
