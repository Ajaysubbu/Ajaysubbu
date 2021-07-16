package selPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchwindow {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().browserVersion("86.0.4240.183").setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		 String parentwindow = driver.getWindowHandle();
		System.out.println(" Parentwindow name is " +parentwindow);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		 Set<String>  windowhandles = driver.getWindowHandles();
		
	Iterator<String > itr = windowhandles.iterator();
	
	while ( itr.hasNext())
	{
		String childwindowname = itr.next();
		
		if (!parentwindow.equalsIgnoreCase(childwindowname))
				{
			driver.switchTo ().window(childwindowname);
			System.out.println(driver.switchTo ().window(childwindowname).getTitle());
			driver.manage().window().maximize();
				}
		System.out.println("Come back to Window1");
		driver.switchTo ().window(parentwindow);
	}


	}

}
