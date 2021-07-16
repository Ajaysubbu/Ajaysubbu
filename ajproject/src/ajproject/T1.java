package ajproject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class T1 {

	public static void main(String[] args)
	{
		 
 //System.setProperty("webdriver.Firefox.marianette", " D:\\Selenium Automation Files\\Drivers\\geckodriver.exe");
FirefoxDriver driver =new FirefoxDriver();
 driver.get("http://www.google.com");
 
	}

}
