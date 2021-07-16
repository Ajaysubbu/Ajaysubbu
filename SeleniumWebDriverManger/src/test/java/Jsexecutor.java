import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jsexecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("86.0.4240.183").setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://system.netsuite.com/");
	    WebElement Login =driver.findElement(By.xpath("//input[@id='userName']"));
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    JsUtiles.drawborder(Login, driver);
		   TakesScreenshot ts = ((TakesScreenshot) driver);
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File target= new File(".\\SeleniumWebDriverManger\\Home.png");
		   try {
			FileUtils.copyFile(src,target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Screenshot Done");
		}
		   

		//driver.close();
		//driver.quit();

	}
	
	

}
