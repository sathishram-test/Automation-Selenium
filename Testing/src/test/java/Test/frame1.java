package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class frame1 
{

	private static WebDriver driver=null;

	@BeforeTest
	public void chromeBrowseropen() 

	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\Auto\\Testing\\drivers\\firefoxdriver\\geckodriver.exe");  
		
		driver = new FirefoxDriver();

	}


	@Test
	public void facebookOpen()

	{

		driver.get("https://facebook.com");
		System.out.println("facebook page is opened now");
		//driver.findElement(By.name("q")).sendKeys("automation framework");
		System.out.println("The search item entered");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
		driver.close();
		
		/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 * System.out.println("Now clicked the search button");
		 */
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("Test")));
		
	}

	@AfterTest
	public void facebookClose() 
 
	{

		System.out.println("Facebook page closed");
	}

}
