package fwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPath {


	private static WebDriver driver=null;

	public static void main(String[] args)

	{

		System.setProperty("webdriver.gecko.driver", "F:\\Auto\\Testing\\drivers\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.tnpds.gov.in/");
		
		driver.manage().window().maximize();


		System.out.println("The google search completed");

		WebElement element =driver.findElement(By.xpath("//label[contains(text(),'English')]"));
		element.clear();
		driver.quit();
	}
	

}
