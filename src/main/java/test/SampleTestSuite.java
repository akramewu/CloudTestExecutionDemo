package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleTestSuite 
{
  @Test
  public void testGLS() throws MalformedURLException
  {
	  /**
	   * create capabilities
	   */
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setPlatform(Platform.WIN8);
	  caps.setBrowserName("firefox");
	  
	  /**
	   * create server url
	   */
	  String stringUrl ="https://akram61:1sxPy2Uxa4sbYnAqQtEy@hub-cloud.browserstack.com/wd/hub";
	  URL serverURL = new URL (stringUrl);
	  
	  WebDriver driver = new RemoteWebDriver(serverURL, caps);
	  driver.get("https://qs.gls-group.eu/DE/de/home");
	  driver.findElement(By.cssSelector("#gls_app_loginForm_0 input[name='username']")).sendKeys("autotest");
	  driver.findElement(By.cssSelector("#gls_app_loginForm_0 input[name='password']")).sendKeys("autotest"); 
	  driver.findElement(By.id("gls_app_button_0_label")).click();
	  //driver.findElement(By.xpath(".//*[@id='navbar-user']/li[2]/a")).click();
	  
	  driver.quit();
  }
}
