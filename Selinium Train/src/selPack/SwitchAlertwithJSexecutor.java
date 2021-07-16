package selPack;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertwithJSexecutor {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		List<WebElement> framelist = driver.findElements(By.tagName("frame"));
		System.out.println("Total Size"+framelist.size());
		driver.switchTo().frame(0);
		WebElement Trybutton = driver.findElement(By.xpath("//button[contains(text(),'Try it')]")) ;
		Trybutton.click();
		HandleJSAlert(driver);
		Thread.sleep(6000);
		System.out.println("Program Completed");
		//driver.close(); 

		/*  driver.findElement(By.xpath("//button[@id='alert']")).click();
		   Thread.sleep(5000);
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText()); 
		 alt.accept();  */

	}

	public static void HandleJSAlert(WebDriver driver) throws Throwable
	{
		Scanner input = new Scanner(System.in);

		try 
		{
			Alert alert = driver.switchTo().alert();
			Thread.sleep(4000);

			System.out.println("Do you want to handle the Alert: \nIf yes press 'Y' else 'N'");
			String choice = input.next();
			String AlertText = alert.getText();

			System.out.println("This is Error msg: "+AlertText);
			if(choice.equalsIgnoreCase("Y"))
			{
				alert.accept(); //By Clicking OK Button
				System.out.println("Alert Accepted");
			}
			else
			{
				alert.dismiss();//By Clicking Cancel/Close Button
				System.out.println("Alert Dismissed");
			}

			driver.findElement(By.name("txtPassword")).sendKeys("Password");
		} 
		catch (Exception e) 
		{
			System.out.println("No Alert Present");
			System.out.println("This is and Error: "+e);
		}


	}
}
