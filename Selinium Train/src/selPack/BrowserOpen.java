package selPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;

 public class BrowserOpen {

	public static void main(String[] args) {
		 
// System.setProperty("webdriver.chrome.driver", "D:\\Standalone jar\\chromedriver_win32\\chromedriver.exe");
 System.setProperty("webdriver.gecko.driver", "D:\\Standalone jar\\Firefox\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 driver.get("http://www.google.com");


//WebDriver driver = new ChromeDriver();
//driver.get("http://www.google.com");
	}

}
