package selPack;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop2 {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	driver.get("https://demoqa.com/draggable/");
				
		Thread.sleep(2000);
	 Actions cursor=new Actions (driver);
		// Robot cursor = new Robot ( );
		
		WebElement src = driver.findElement(By.xpath("//div[@id ='draggable']"));
				 
       int x_cordinate =src.getLocation().getX();
       int y_cordinate = src.getLocation().getY();
       
       System.out.println( "First");
       System.out.println( x_cordinate);
       System.out.println(y_cordinate);
       
       int x1 =x_cordinate +150;
       int y1 =y_cordinate +30;
       
    // cursor.mouseMove(786, 519);
    	
        cursor.dragAndDropBy(src, x1, y1).build().perform();

       //int x_cordinate1 =src.getLocation().getX();
       //int y_cordinate1 = src.getLocation().getY();
       
       System.out.println( "final");
       
       System.out.println(x1);
       System.out.println(y1);

 


	}

}
