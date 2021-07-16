package selPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Testgroovy {
	WebDriver driver ;
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		driver.findElement(By.xpath("//b[contains(text(),'Admin')']']")).click();



	}

}


