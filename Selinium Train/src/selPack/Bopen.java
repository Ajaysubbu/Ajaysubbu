package selPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(5000);
		driver.navigate().to("https:www.google.com/");

		WebElement GoogleLogo  ;
		//GoogleLogo =driver.findElement(By.id("hplogo"));
		//GoogleLogo =driver.findElement(By.
		//String s = GoogleLogo.getText();
		//GMail   =driver.findElement(By.class("gb_g"));
		//System.out.println(s);

	}

}
