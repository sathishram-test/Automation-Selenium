package fwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fireOpen
{

	private static WebDriver driver=null;

	@BeforeTest
	public void setUpBrowser()

	{
		System.setProperty("webdriver.gecko.driver", "F:\\Auto\\Testing\\drivers\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void loginGoogle() throws Exception 

	{

		driver.get("https://google.com");
		WebElement  search =driver.findElement(By.name("q"));
		search.sendKeys("Technical stuff required");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		search.sendKeys(Keys.RETURN);
		driver.quit();
		System.out.println("The google search completed");
		

	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("The google search done");
		
	}
}
