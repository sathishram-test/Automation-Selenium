package fwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.Capabilities;

public class cwork

{

private static WebDriver driver=null;

@BeforeTest
public void chromeOPen()

{
	
	
	
 System.setProperty("webdriver.chrome.driver", "F:\\Auto\\Testing\\drivers\\chromedriver\\chromedriver.exe");
 
 //driver= new ChromeDriver();
 //DesiredCapabilities cap= new DesiredCapabilities();
 
 
//Create object of ChromeOptions class
ChromeOptions options = new ChromeOptions();

//add parameter which will disable the extension
options.addArguments("--ignore-certificate-errors");

//Start the chrome session
WebDriver driver = new ChromeDriver(options);
 
}

@Test
public void loginGoogleFromChrome() throws Exception 

{

	driver.get("https://google.com");
	driver.manage().window().fullscreen();
	WebElement  search =driver.findElement(By.name("q"));
	search.sendKeys("Software Testing with Selenium");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	search.sendKeys(Keys.RETURN);
	driver.quit();
	System.out.println("The google search completed on chrome");
	

}

@AfterTest
public void closeChromeBrowser()
{
	System.out.println("The google search done on chrome");
	
}


}
