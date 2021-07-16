package selPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webelementfunc {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Standalone jar\\Firefox\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement( By.id("txtUsername")).sendKeys("Admin");
		driver.findElement( By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement( By.id("menu_admin_viewAdminModule")).click();
		driver.findElement( By.id("menu_admin_UserManagement")).click();
		driver.findElement( By.id("menu_admin_viewSystemUsers")).click(); 
		driver.findElement( By.id("btnAdd")).click();
		Thread.sleep(5000);
		Select UserRole = new Select( driver.findElement( By.id("systemUser_userType")));
		UserRole.selectByVisibleText("Admin"); 
		
		driver.findElement( By.id("systemUser_employeeName_empName")).sendKeys("a");
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='ac_results']//ul")).click();
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_employeeName_empName")));

		List<WebElement> opt =driver.findElements(By.xpath("//div[@class='ac_results']//li"));



		/*for(WebElement val: opt ) {

			System.out.println("Selected value: " +val.getAttribute("inner text") );
			/*if (val.getText().equalsIgnoreCase("John Smith"))
			{
			 System.out.println("Selected value: " +val );

			}*/

		for(int i=0;i<opt.size();i++)
		{

			WebElement val = opt.get(i);

			String DDV = val.getAttribute("innerText");

			System.out.println("Dropdown values are " +DDV );

			if (DDV.equalsIgnoreCase("Jasmine Morgan"))https://dl.bintray.com/testng-team/testng-eclipse-release/.
			{

				val.click();
				//break;

				//Thread.sleep(2000);

				//driver.close ();
			} 



		}

	}
}
