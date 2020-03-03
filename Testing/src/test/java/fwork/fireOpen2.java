package fwork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fireOpen2
{

	private static WebDriver driver=null;

	@BeforeTest
	public void setUpBrowser()

	{
		System.setProperty("webdriver.gecko.driver", "F:\\Auto\\Testing\\drivers\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void loginGoogle2() throws Exception

	{

		driver.get("https://www.tnpds.gov.in/");

		driver.manage().window().maximize();

		System.out.println("Navigated to application home page");

		//this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\second.png");

		WebElement element =driver.findElement(By.xpath("//label[contains(text(),'English')]"));

		System.out.println("Selecting English Language");

		//this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\third.png");

		element.click();

		System.out.println("Navigated to Smart app page");

		WebElement smartapp=driver.findElement(By.xpath("//span[contains(text(),'Smart Card Application')]"));

		//this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\Englishlan.png");

		System.out.println("Clicking smart app");

		smartapp.click();

		//this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\smartapp.png");

		System.out.println("Completed the task");

	}

	@Test
	public void smartDetails() throws Exception

	{
		WebElement safill=driver.findElement(By.xpath("//input[@type='text'][@name='form:aname']"));

		safill.sendKeys("Sathishkumr");

		System.out.println("Family head name entered");

		this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\familyhead.png");

		Select district=new Select(driver.findElement(By.xpath("//select[@name='form:districts']")));

		district.selectByIndex(28);

		this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\disctric.png");

		Select taluk=new Select(driver.findElement(By.xpath("//select[@name='form:taluks']")));

		taluk.selectByIndex(4);

		this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\taluk.png");

		System.out.println("taluk Entered");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");


		Select villa=new Select(driver.findElement(By.xpath("//select[@name='form:villages']")));

		System.out.println("Village begin");
		
		villa.selectByIndex(26);
		
		
		this.cameraWork1(driver,"F:\\Auto\\Testing\\Testing\\ScreenShots\\village.png");

		System.out.println("Village Entered");

		driver.quit();

	}
	

	public void cameraWork1(WebDriver driver, String fileWithPath) throws Exception

	{
		TakesScreenshot camera=((TakesScreenshot)driver);

		File srcfile=camera.getScreenshotAs(OutputType.FILE);

		File DestFile=new File(fileWithPath);

		FileUtils.copyFile(srcfile, DestFile); 


	}

	@AfterTest
	public void closeBrowser2()

	{
		System.out.println("The Testing completed");

	}
}
