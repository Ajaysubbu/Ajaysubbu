package selPack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		  driver.findElement(By.xpath("//button[@id='alert']")).click();
		   Thread.sleep(5000);
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText()); 
		 alt.accept();
		
		 
		 
		 
				 
 

	}

}
