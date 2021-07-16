package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {

	static WebDriver driver ;

	public static WebDriver getbrowser(String browserName) {
		if (driver==null) {
			if (browserName.equalsIgnoreCase("Firefox")) {
				driver =new FirefoxDriver();
			}
			if (browserName.equalsIgnoreCase("chrome")) {
				driver =new ChromeDriver();
			}
			if (browserName.equalsIgnoreCase("IE")) {
				driver =new InternetExplorerDriver();
			}
		}

		return driver;	

	}
	public static void closeBrowser() {
		driver.quit();
	}
}
