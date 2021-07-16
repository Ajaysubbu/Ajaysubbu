package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testgroovy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath( "//a[@class='login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("ss@jj.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Subbu");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("ajay1234");
		//driver.findElement(By.id("months")).click();
		Thread.sleep(5000);
		/*Select month =new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("December ");
		driver.findElement(By.id("months")).click(); 
		// new Select(driver.findElement(By.id("days  "))).selectByVisibleText("25");
		//new Select(driver.findElement(By.id("years"))).selectByVisibleText("1980");*/
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
		//driver.findElement(By.xpath("//input[@id='optin'")).click();
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("CEI");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Lake View");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("AJ Apartments");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("illinois");
		Thread.sleep(5000);
		Select state =new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		driver.findElement(By.xpath("//select[@id='id_state']")).click();
		state.selectByVisibleText("Illinois");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("60411");
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Practice");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7848595521");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8759495112");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Home Address");
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		String Actual= driver.findElement(By.xpath("//a[@class='account']")).getText();
		if (Actual.equalsIgnoreCase("Ajay Subbu" ))
		{
			System.out.println("Account name is "  +Actual);
		}
	}    

}
