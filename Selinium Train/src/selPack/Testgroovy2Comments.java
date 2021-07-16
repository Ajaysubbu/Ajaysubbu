package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testgroovy2Comments {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email_create")).sendKeys("qa3@jj.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("id_gender1")).click(); 
		driver.findElement(By.id("customer_firstname")).sendKeys("Raju");
		String fname = driver.findElement(By.id("customer_firstname")).getText();
	    driver.findElement(By.id("customer_lastname")).sendKeys("Raja");
	    String Lname =driver.findElement(By.id("customer_lastname")).getText();
		driver.findElement(By.id("passwd")).sendKeys("ajay1234");
		
		Thread.sleep(5000);
		Select Date =new Select(driver.findElement(By.id("days")));
		driver.findElement(By.id("days")).click();
		Date.selectByVisibleText("25  ");
		Thread.sleep(5000);
		Select month =new Select(driver.findElement(By.id("months")));
		driver.findElement(By.id("months")).click();
		month.selectByVisibleText("December ");
		Thread.sleep(5000);
		Select year =new Select(driver.findElement(By.id("years")));
		driver.findElement(By.id("years")).click();
		year.selectByVisibleText("1980  ");
		driver.findElement(By.id("years")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("company")).sendKeys("CEI");
		driver.findElement(By.id("address1")).sendKeys("Lake View");
		driver.findElement(By.id("address2")).sendKeys("AJ Apartments");
		driver.findElement(By.id("city")).sendKeys("illinois"); 
		Thread.sleep(5000);
		Select state =new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		driver.findElement(By.id("id_state")).click();
		state.selectByVisibleText("Illinois");
		driver.findElement(By.id("postcode")).sendKeys("60411");
		driver.findElement(By.id("other")).sendKeys("Practice");
		driver.findElement(By.id("phone")).sendKeys("7848595521");
		driver.findElement(By.id("phone_mobile")).sendKeys("8759495112");
		driver.findElement(By.id("alias")).sendKeys("Home Address");
		driver.findElement(By.id("submitAccount")).click();
		String Actual= driver.findElement(By.className("account")).getText();
		String Expname = fname.concat(Lname);
		System.out.println("Acct name :" +Expname);
		if (Actual.equalsIgnoreCase(Expname ))
		{
			System.out.println("Account name is "  +Actual);
		}
	}    

}
