package SeleniumGrid;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;


public class Griddemo {
	@Test
	public void gridFirefox() throws MalformedURLException {
	DesiredCapabilities cap= new DesiredCapabilities();
	 cap.setPlatform(Platform.WINDOWS);
	 cap.setBrowserName(BrowserType.FIREFOX);
	 
	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.169:4444/wd/hub"),cap);
	 driver.manage().window().maximize();
	 driver.get("http;//google.com");
	 System.out.println("Title is"+driver.getTitle());
	 driver.quit();
	}
	 

}
