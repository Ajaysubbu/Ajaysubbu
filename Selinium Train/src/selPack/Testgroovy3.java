package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testgroovy3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath( "//a[@class='login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("aj@jj.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		WebElement err =driver.findElement(By.id("create_account_error"));
			if (err.isEnabled())
		{
			Thread.sleep(5000);
			WebElement msg = driver.findElement(By.id("create_account_error"));
			System.out.println("Captured Err msg :"+ msg.getText());
		}
			}    

}
