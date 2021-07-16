package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://demoqa.com/droppable/");
		Actions cursor=new Actions (driver);

		WebElement src = driver.findElement(By.xpath("//div[@id ='draggable']"));
		WebElement Dest = driver.findElement(By.xpath("//div[@id ='droppable']"));


		cursor.dragAndDrop(src, Dest).build().perform();


	}

}
