package selPack;

import java.awt.AWTException;
 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roboclass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		/*driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		WebElement upload = driver.findElement(By.xpath("//input[@name='uploadCV']"));
		 		
		Robot robot =new Robot ();
		Point p =  upload.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println("X: =" +x);
		System.out.println("Y: =" +y);
				
		//robot.mouseMove(x, y);
		robot.mouseMove(x+150, y+50 );
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		setclipboardData("C:\\Users\\SAjay\\Desktop\\Ajay_Subbaian\\Resume and BIO\\Ajay Subbaiyan- Bios");
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		
		String uploadstatus= driver.findElement(By.xpath("//*[text()='File uploaded successfully']")).getText();
		
		System.out.println(uploadstatus);
		
		if (uploadstatus.equalsIgnoreCase(("File uploaded successfully")))
		{
			System.out.println("Files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded");
		}*/
	    
	    driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
	    	Thread.sleep(5000);
	    	driver.findElement(By.name("note")).sendKeys("C:\\Users\\SAjay\\Desktop\\Ajay_Subbaian\\Resume and BIO\\Ajay Subbaiyan- Bios");
	    	driver.findElement(By.name("note")).submit();
	    
	}

	private static void setclipboardData(String FileToBeUpload) {
	 StringSelection Selection =new StringSelection (FileToBeUpload);
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		
	}

}
