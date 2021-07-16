package selPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationcommands {

	public static void main(String[] args) {
		 
 System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
//System.setProperty("webdriver.gecko.driver", "D:\\Standalone jar\\Firefox\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
  WebDriver driver = new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
 String Title = driver.getTitle();
 System.out.println("Appication Title is " + Title);
   
 String URL = driver.getCurrentUrl ();
 System.out.println("Appication URL is  " + URL);
 driver.get("https://google.com");
 driver.navigate().back ();
  driver.navigate().forward  ();
 driver.close ();
 
 
 
	}

}
