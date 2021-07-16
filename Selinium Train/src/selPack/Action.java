package selPack;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
				
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement Men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions cursor= new Actions (driver);
		cursor.moveToElement(Men).build().perform();
		Thread.sleep(2000);
		 WebElement  TShirts = driver.findElement(By.xpath("//*[text()='T-Shirts']//ancestor::a[1]"));
		//cursor.moveToElement(Men).moveToElement(TShirts).click().build().perform();
		// driver.findElement(By.xpath("//*[text()='T-Shirts']//ancestor::a[1]")).click();	
		 cursor.moveToElement(TShirts).click().build().perform();
	 		 
			System.out.println("Tshirt clicked after");
	}

}
