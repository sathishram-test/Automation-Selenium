package fwork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class cameraWork {
	
	private static WebDriver driver=null;


	public static void main(String[] args) throws Exception 
	
	{
		
		
		TakesScreenshot camera=((TakesScreenshot)driver);
		
		File srcfile=camera.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File("F:\\Auto\\Testing\\Testing\\ScreenShots\\first.png");
		
		FileUtils.copyFile(srcfile, DestFile);
		

	}

}
