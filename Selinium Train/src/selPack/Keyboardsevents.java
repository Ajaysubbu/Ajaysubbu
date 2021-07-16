package selPack;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardsevents {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://www.google.com/");

		Thread.sleep(2000);
		Actions cursor=new Actions (driver);
		// Robot cursor = new Robot ( );

		WebElement src = driver.findElement(By.xpath("//span[@id='body']//a[5]"));

		cursor.contextClick(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
 Keys.chord(Keys.CONTROL.ALT.DELETE)



	}

}
