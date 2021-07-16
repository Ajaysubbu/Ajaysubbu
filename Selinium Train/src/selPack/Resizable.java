package selPack;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://demoqa.com/resizable/");

		Thread.sleep(2000);
		Actions cursor=new Actions (driver);
		// Robot cursor = new Robot ( );

		WebElement src = driver.findElement(By.xpath("//div[@id='resizable']"));

		cursor.clickAndHold(src).moveToElement(src,src.getLocation().getX(),450).release().build().perform();
		System.out.println(src.getLocation().getY());
		



		

	}

}
