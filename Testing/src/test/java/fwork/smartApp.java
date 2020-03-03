package fwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class smartApp 
{

	private static WebDriver driver=null;
	private Object cameraWork1(WebDriver driver, String fileWithPath) {
		return null;
	}
	
	@Test
	public void smartDetails()
		
	{
	
		
		
		WebElement safill=driver.findElement(By.xpath("//input[@type='text'][@name='form:aname']"));
		safill.sendKeys("Sathishkumr");
		this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\Filling Details.png");
		
	}
}
