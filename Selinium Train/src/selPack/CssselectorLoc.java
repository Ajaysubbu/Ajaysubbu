package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssselectorLoc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Standalone jar\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Below code is for CSS Combinations
		driver.get("http://www.tnstc.in/TNSTCOnline");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text'][name='txtUserLoginID'][maxlength='27']")).sendKeys("Demo");


	}

}
