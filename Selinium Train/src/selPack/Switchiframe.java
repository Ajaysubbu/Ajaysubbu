package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchiframe {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qhmit.com/html/templates/frames/frames_example_3.html");
		 List<WebElement> framelist = driver.findElements(By.tagName("frame"));

		 System.out.println("Total Size"+framelist.size());
		 driver.switchTo().frame(0);
		 driver.findElement(By.linkText("Menu 2")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(framelist.get(1));
		 System.out.println("Frame 1 reached");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[contains(text(),'Green Page')]")).click();
		  System.out.println("Green page reached");
		  driver.switchTo().defaultContent();
				  Thread.sleep(5000);
		  System.out.println("Exit from Frame");
	}

}
